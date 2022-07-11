package com.example.validacao.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<FieldError> errors = ex.getBindingResult().getFieldErrors();


		//manipula o retorno do erro.
		return new ResponseEntity<>(
				ValidationExceptionDTO.builder()
						.timestamp(LocalDateTime.now())
						.title("Campos Invalidos")
						.messeger(ex.getClass().getName())
						.fields(errors.stream().map(FieldError::getField).collect(Collectors.joining("; ")))
						.fieldsMessages(errors.stream().map(
							FieldError::getDefaultMessage).collect(Collectors.joining("; ")))

						.build()
				,HttpStatus.BAD_REQUEST
		);
	}
}
