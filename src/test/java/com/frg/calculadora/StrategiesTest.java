package com.frg.calculadora;

import com.frg.calculadora.strategies.Restar;
import com.frg.calculadora.strategies.Sumar;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.doesNotHave;

@SpringBootTest
public class StrategiesTest {

    @Test
    void SumarTest(){

        double op1 = 3.565;
        double op2 = 9.123;

        Sumar sumar = new Sumar();
        assertThat(sumar.calcularResultado(op1,op2)).isEqualTo(op1+op2);
    }

    @Test
    void RestarTest(){

        double op1 = 7.873;
        double op2 = 91.625;

        Restar restar = new Restar();
        assertThat(restar.calcularResultado(op1,op2)).isEqualTo(op1-op2);
    }
}
