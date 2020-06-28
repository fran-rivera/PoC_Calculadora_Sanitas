package com.frg.calculadora.controller;

import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.utils.Operador;
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

    @GetMapping("/calculate")
    public double calcular(double op1, double op2, Operador operador) {

        double result = 0;

        return result;
    }
}
