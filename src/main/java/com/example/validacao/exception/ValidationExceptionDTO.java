package com.example.validacao.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ValidationExceptionDTO {
	private String title;
	private String messeger;
	private String fields;
	private String fieldsMessages;
	private LocalDateTime timestamp;
}
