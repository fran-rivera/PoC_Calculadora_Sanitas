package com.frg.calculadora.strategies;

import com.frg.calculadora.base.ICalculadoraStrategy;

/**
 * Strategy: Clase que implementa la operación Restar usando la interfaz strategy.
 */
public class Restar implements ICalculadoraStrategy {

    public Restar() {
    }

    @Override
    public double calcularResultado(double op1, double op2) {
        return op1 - op2;
    }
}
