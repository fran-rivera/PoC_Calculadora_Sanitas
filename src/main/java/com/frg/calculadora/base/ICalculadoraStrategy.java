package com.frg.calculadora.base;

/**
 * Interfaz Strategy: Interfaz que define el nombre del método que implementaran las clases encargadas
 * de los calculos aritmeticos (Clases Strategy).
 */
public interface ICalculadoraStrategy {

    /**
     * Metodo invocado para calcular el resultado de la operación aritmética identificado por la
     * estrategia concreta.
     *
     * @return double resultado de la operación aritmética.
     */
    double calcularResultado(double op1, double op2);
}
