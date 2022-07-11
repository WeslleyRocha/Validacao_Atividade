package com.example.validacao.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDTO {

	@NotBlank (message = "Campo Obrigatório!")
	private String nome;

	@NotBlank (message = "E-mail é obrigatório.")
	@Email (message = "E-mail esta no formato incorreto. ")
	private String email;

	@Min ( value = 18, message = "Idade minima 18 anos.")
	@Max (value = 100, message = "idade maxima. ")
	private int idade;
}
