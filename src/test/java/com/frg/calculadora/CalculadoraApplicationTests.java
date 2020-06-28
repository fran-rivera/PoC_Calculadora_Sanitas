package com.frg.calculadora;

import com.frg.calculadora.controller.CalculadoraController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CalculadoraApplicationTests {

	@Autowired
	private CalculadoraController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
