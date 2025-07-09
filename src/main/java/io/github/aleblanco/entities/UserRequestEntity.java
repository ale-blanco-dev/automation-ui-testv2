package io.github.aleblanco.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequestEntity {
    private String name;
    private String job;
    private String email;
    private String password;
}