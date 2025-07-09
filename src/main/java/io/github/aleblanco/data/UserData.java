package io.github.aleblanco.data;

import io.github.aleblanco.entities.UserRequestEntity;

public class UserData {

    private UserData() {
    }

    public static UserRequestEntity withNameAndJob(String name, String job) {
        return UserRequestEntity.builder()
                .name(name)
                .job(job)
                .build();
    }

    public static UserRequestEntity withEmailAndPassword(String email, String password) {
        return UserRequestEntity.builder()
                .email(email)
                .password(password)
                .build();
    }
}

