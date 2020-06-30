package com.frg.calculadora.controller;

import com.frg.calculadora.model.CalculadoraResponse;
import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.utils.Operador;
import io.corp.calculator.TracerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
/**
 * Controller del API Rest
 */
public class CalculadoraController {

    private CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    private TracerImpl tracer = new TracerImpl();

    @GetMapping("/calculate")
    public CalculadoraResponse calcular(double op1, double op2, Operador operador) {

        CalculadoraResponse calculadoraResponse = new CalculadoraResponse();

        calculadoraResponse.setOperando1(String.valueOf(op1));
        calculadoraResponse.setOperando2(String.valueOf(op2));
        calculadoraResponse.setOperador(operador);
        calculadoraResponse.setResultado(calculadoraService.calcular(op1,op2,operador));

        tracer.trace(calculadoraResponse.getResultado());

        return calculadoraResponse;
    }
}
