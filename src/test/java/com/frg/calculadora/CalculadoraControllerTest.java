package com.frg.calculadora;

import com.frg.calculadora.controller.CalculadoraController;
import com.frg.calculadora.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraControllerTest {

    @Mock
    CalculadoraService calculadoraService;

    @Test
    void whenCallCalculate_shouldCallServiceAndReturnResult(){
        CalculadoraController sut = new CalculadoraController(calculadoraService);
    }
}
