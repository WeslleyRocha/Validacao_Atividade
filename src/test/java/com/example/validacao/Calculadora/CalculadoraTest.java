package com.example.validacao.Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

	private Calculadora calculadora;

	@BeforeEach
	public void setupCalculadora(){
		calculadora =  new Calculadora();
	}

	@Test
	@DisplayName("Teste com o valor diferente de 0 ")
	void dividir_TesteComOValorDiferentede0 () {
		Calculadora calculadora = new Calculadora();

		double a = 4;
		double b = 2;
		double valorEsperado = 2;

		double resultado = calculadora.dividir(a, b);

		assertEquals(valorEsperado, resultado);
	}

	@Test
	@DisplayName("Teste com o valor 0 esperado")
	void dividir_ValorEsoerado_0 () {
		Calculadora calculadora = new Calculadora();

		double a = 4;
		double b = 0;
		double valorEsperado = 0;

		double resultado = calculadora.dividir(a, b);

		assertEquals(valorEsperado, resultado);
	}

}