package com.frg.calculadora.controller;

import com.frg.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
