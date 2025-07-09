Proyecto de automatización UI y API desarrollado con **Serenity BDD** usando el patrón **Screenplay**. Este fue uno de mis primeros proyectos serios en automatización y lo he mejorado recientemente para hacerlo más **escalable, dinámico y profesional**.

Cubre tres flujos principales:  
1. Login  
2. Booking de habitaciones
3. Peticiones a una API pública

## Tecnologías utilizadas

- 🟨 **Java**
- 🟨 **Serenity BDD**
- 🟨 **Gradle**
- 🟨 **Cucumber**
- 🟨 **Selenium WebDriver**
- 🟨 **RestAssured**
- 🟨 **Lombok**
- 🟨 **Screenplay Pattern**

## Estructura general del proyecto
```bash
automation-ui-testv2/
├── src/
│   ├── main/java/
│   │   └── (data, entities, questions, tasks(web,api), userinferfaces(web),utils,paths)
│   └── test/java/
│       └── (step definitions, runners)
├── resources/
│   └── features/
├── build.gradle
└── serenity.conf
```

## Demostración (.gif)

## Instrucciones
Ejecutar desde tu IDE (IntelliJ recomendado):

### Login UI - SauceDemo
```bash
-ea -Dcucumber.filter.tags="@all" -DURL_ECOMMERCE="https://www.saucedemo.com/"
```
### Booking UI - AutomationInTesting
```bash
-ea -Dcucumber.filter.tags="@all" -DBOOKING_A_ROOM="https://automationintesting.online/"
```
### API Testing - ReqRes
```bash
-ea -Dcucumber.filter.tags="@all" -DAPI_REQ_RES="https://reqres.in/" -DX_API_KEY_VALUE="reqres-free-v1"
```
