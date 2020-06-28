package com.frg.calculadora;

import com.frg.calculadora.controller.CalculadoraController;
import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.utils.Operador;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculadoraControllerTest {

    @Mock
    CalculadoraService calculadoraService;

    @Test
    void whenCallCalculate_shouldCallServiceAndReturnResult(){

        double op1 = 5;
        double op2 = 7;
        Operador operador = Operador.RESTAR;
        double expected = 0;

        CalculadoraController sut = new CalculadoraController(calculadoraService);
        assertEquals(expected,sut.calcular(op1,op2,operador));


    }
}
