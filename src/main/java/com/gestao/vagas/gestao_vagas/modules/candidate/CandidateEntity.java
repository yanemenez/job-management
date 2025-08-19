package com.gestao.vagas.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;


@Data //get e setter
public class CandidateEntity {

    private UUID id;
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço") //validation
    private String username;

    @Email(message = "O campo [email] deve conter um email válido") //validation
    private String email;

    @Length(min = 10, max = 100) //password
    private String password;
    private String description;
    private String curriculum;

}
