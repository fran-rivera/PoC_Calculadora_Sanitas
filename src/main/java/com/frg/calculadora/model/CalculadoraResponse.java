package com.frg.calculadora.model;

import com.frg.calculadora.utils.Operador;


public class CalculadoraResponse {

    private String operando1;
    private String operando2;
    private Operador operador;
    private double resultado;

    public CalculadoraResponse() {
    }

    public String getOperando1() {
        return operando1;
    }

    public void setOperando1(String operando1) {
        this.operando1 = operando1;
    }

    public String getOperando2() {
        return operando2;
    }

    public void setOperando2(String operando2) {
        this.operando2 = operando2;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "CalculadoraResponse{" +
                "operando1='" + operando1 + '\'' +
                ", operando2='" + operando2 + '\'' +
                ", operador=" + operador +
                ", resultado=" + resultado +
                '}';
    }
}
