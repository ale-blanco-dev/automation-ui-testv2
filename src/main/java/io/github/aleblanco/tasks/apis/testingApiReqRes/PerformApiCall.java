package io.github.aleblanco.tasks.apis.testingApiReqRes;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static io.github.aleblanco.utils.constants.Constants.API_REQ_RES;
import static io.github.aleblanco.utils.constants.Constants.X_API_KEY_VALUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PerformApiCall implements Task {

    private final String method;
    private final String path;
    private final Object body;

    public PerformApiCall(String method, String path, Object body) {
        this.method = method;
        this.path = path;
        this.body = body;
    }

    public static PerformApiCall with(String method, String path, Object body) {
        return instrumented(PerformApiCall.class, method, path, body);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(API_REQ_RES));

        switch (method.toUpperCase()) {
            case "POST":
                actor.attemptsTo(Post.to(path).with(req -> req.header("x-api-key", X_API_KEY_VALUE).body(body).log().all()));
                break;
            case "PUT":
                actor.attemptsTo(Put.to(path).with(req -> req.header("x-api-key", X_API_KEY_VALUE).body(body).log().all()));
                break;
            case "GET":
                actor.attemptsTo(Get.resource(path).with(req -> req.header("x-api-key", X_API_KEY_VALUE).log().all()));
                break;
            case "DELETE":
                actor.attemptsTo(Delete.from(path).with(req -> req.header("x-api-key", X_API_KEY_VALUE).log().all()));
                break;
            default:
                throw new IllegalArgumentException("Not method allowed: " + method);
        }

        Response response = SerenityRest.lastResponse();
        actor.remember("status", response.statusCode());
    }
}
