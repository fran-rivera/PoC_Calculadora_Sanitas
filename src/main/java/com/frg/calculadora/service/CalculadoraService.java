package com.frg.calculadora.service;

import com.frg.calculadora.base.CalculadoraContext;
import com.frg.calculadora.strategies.Restar;
import com.frg.calculadora.strategies.Sumar;
import com.frg.calculadora.utils.Operador;
import org.springframework.stereotype.Service;
/**
 * Servicio de la aplicación
 */
@Service
public class CalculadoraService {

    CalculadoraContext calculadoraContext;

    public double calcular(double op1, double op2, Operador operador) {
        double result = 0;

        switch (operador) {
            case SUMAR:
                calculadoraContext = new CalculadoraContext(new Sumar());
                result = calculadoraContext.calcular(op1,op2);
                break;

            case RESTAR:
                calculadoraContext = new CalculadoraContext(new Restar());
                result = calculadoraContext.calcular(op1,op2);
                break;

            default:
                throw new UnsupportedOperationException();

        }

        return result;
    }
}
