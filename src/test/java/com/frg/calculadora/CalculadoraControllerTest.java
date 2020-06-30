package com.frg.calculadora;

import com.frg.calculadora.base.CalculadoraContext;
import com.frg.calculadora.controller.CalculadoraController;
import com.frg.calculadora.model.CalculadoraResponse;
import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.strategies.Restar;
import com.frg.calculadora.strategies.Sumar;
import com.frg.calculadora.utils.Operador;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

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

        expected = this.getResultCalculate(op1,op2,operador);
        doReturn(expected).when(calculadoraService).calcular(op1,op2,operador);

        CalculadoraController sut = new CalculadoraController(calculadoraService);
        CalculadoraResponse calculadoraResponse = sut.calcular(op1,op2,operador);

        verify(calculadoraService, times(1)).calcular(op1,op2,operador);
        assertEquals(expected,calculadoraResponse.getResultado());

    }

    private double getResultCalculate(double op1, double op2, Operador operador){
        double result = 0;
        CalculadoraContext calculadoraContext;

        switch (operador) {
            case SUMAR:
                calculadoraContext = new CalculadoraContext(new Sumar());
                result = calculadoraContext.calcular(op1, op2);
                break;

            case RESTAR:
                calculadoraContext = new CalculadoraContext(new Restar());
                result = calculadoraContext.calcular(op1, op2);
                break;

            default:
                result = 0;

        }
        return result;
    }
}
