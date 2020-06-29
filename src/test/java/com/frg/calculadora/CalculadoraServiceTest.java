package com.frg.calculadora;

import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.utils.Operador;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculadoraServiceTest {

    @Test
    void whenCalculate_shouldCallMethodAndReturnResult(){
        double op1 = 3;
        double op2 = 5;
        Operador operador = Operador.SUMAR;
        double expected = 0;
        CalculadoraService sut = new CalculadoraService();

        expected = this.getResultCalculate(op1, op2, operador);
        double result = sut.calcular(op1, op2, operador);
        assertEquals(expected, result);

    }

    private double getResultCalculate(double op1, double op2, Operador operador){
        double result = 0;

        switch (operador) {
            case SUMAR:
                result = op1 + op2;
                break;

            case RESTAR:
                result = op1 - op2;
                break;

            default:
                result = 0;

        }
        return result;
    }
}
