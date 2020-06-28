package com.frg.calculadora.service;

import com.frg.calculadora.utils.Operador;
import org.springframework.stereotype.Service;
/**
 * Servicio de la aplicación
 */
@Service
public class CalculadoraService {
    public double calcular(double op1, double op2, Operador operador) {
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
