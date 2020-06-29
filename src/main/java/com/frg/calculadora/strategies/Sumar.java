package com.frg.calculadora.strategies;

import com.frg.calculadora.base.ICalculadoraStrategy;

/**
 * Strategy: Clase que implementa la operación Sumar usando la interfaz strategy.
 */
public class Sumar implements ICalculadoraStrategy {

    public Sumar() {
    }

    @Override
    public double calcularResultado(double op1, double op2) {
        return op1 + op2;
    }
}
