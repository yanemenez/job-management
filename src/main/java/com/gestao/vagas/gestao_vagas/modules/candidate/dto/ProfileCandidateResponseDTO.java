package com.gestao.vagas.gestao_vagas.modules.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Desenvolvedora Java")
    private String description;

    @Schema(example = "loyane")
    private String username;

    @Schema(example = "loyane@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Loyane Menezes")
    private String name;
}
