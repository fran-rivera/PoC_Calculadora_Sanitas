package com.frg.calculadora;

import com.frg.calculadora.base.CalculadoraContext;
import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.strategies.Restar;
import com.frg.calculadora.strategies.Sumar;
import com.frg.calculadora.utils.Operador;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class CalculadoraServiceTest {

    @Mock
    CalculadoraContext calculadoraContext;

    @Test
    void whenCalculate_shouldCallMethodAndReturnResult(){
        double op1 = 3;
        double op2 = 5;
        Operador operador = Operador.SUMAR;
        double expected = 0;
        CalculadoraService sut = new CalculadoraService();

        expected = this.getResultCalculate(op1, op2, operador);
        doReturn(expected).when(calculadoraContext).calcular(op1, op2);

        double result = sut.calcular(op1, op2, operador);
        assertEquals(expected, result);

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
