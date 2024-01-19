package com.example.userAPI.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public record SmsRecordDTO (@NotNull @Pattern(regexp = "^(ENVIADO|RECEBIDO|ERRO DE ENVIO)$") String status){

}
