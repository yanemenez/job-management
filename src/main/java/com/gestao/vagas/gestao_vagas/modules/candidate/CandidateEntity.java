package com.gestao.vagas.gestao_vagas.modules.candidate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;


@Data//get e setter
@Entity(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //creates ID automatically
    private UUID id;

    @Schema(example = "loyane menezes",  requiredMode = Schema.RequiredMode.REQUIRED, description = "Nome do candidato")
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço") //validation
    @Schema(example = "loyane",  requiredMode = Schema.RequiredMode.REQUIRED, description = "Username do candidato")
    private String username;

    @Email(message = "O campo [email] deve conter um email válido") //validation
    @Schema(example = "loyane@gmail.com",  requiredMode = Schema.RequiredMode.REQUIRED, description = "E-mail do candidato")
    private String email;

    @Length(min = 10, max = 100, message = "A senha deve conter entre (10) e (100) caracteres") //password
    @Schema(example = "loyane@123", minLength = 10, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED, description = "Senha do candidato")
    private String password;

    @Schema(example = "Desenvolvedora Java",  requiredMode = Schema.RequiredMode.REQUIRED, description = "Breve descrição do candidato")
    private String description;

    private String curriculum;


    @CreationTimestamp
    private LocalDateTime createdAt;

}
