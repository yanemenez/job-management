package com.gestao.vagas.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //Create constructor with arguments
public class ErrorMessageDTO {

    private String message;
    private String field;
}
