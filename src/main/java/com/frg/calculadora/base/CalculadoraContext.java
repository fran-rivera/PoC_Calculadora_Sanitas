package com.frg.calculadora.base;

/**
 * Context: Clase encargada de invocar a la operación (estrategia) adecuada a través de la referencia a Strategy.
 */
public class CalculadoraContext {

    private ICalculadoraStrategy calculadora;

    public CalculadoraContext(ICalculadoraStrategy calculadora) {

        this.calculadora = calculadora;
    }

    public double calcular(double op1, double op2){

        return calculadora.calcularResultado(op1,op2);
    }
}
