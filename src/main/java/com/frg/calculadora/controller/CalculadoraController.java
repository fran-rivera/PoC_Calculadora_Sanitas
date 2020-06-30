package com.frg.calculadora.controller;

import com.frg.calculadora.model.CalculadoraResponse;
import com.frg.calculadora.service.CalculadoraService;
import com.frg.calculadora.utils.Operador;
import io.corp.calculator.TracerImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Calculadora Sanitas", description = "Prueba Técnica Sanitas")
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

    @Operation(
            summary = "Realiza cálculos aritméticos",
            operationId = "calculate",
            description = "Calculadora que suma y resta dos operandos",
            tags = "Calculadora Sanitas")
    @GetMapping("/calculate")
    public CalculadoraResponse calcular(@RequestParam("Operando1")
                                        @Parameter(
                                                name = "Operando1",
                                                description = "Primer operando de la operación",
                                                required = true) double op1,
                                        @RequestParam("Operando2")
                                        @Parameter(
                                                name = "Operando2",
                                                description = "Segundo operando de la operación",
                                                required = true) double op2,
                                        @RequestParam("Operador")
                                        @Parameter(
                                                name = "Operador",
                                                description = "Operador de la operación",
                                                required = true,
                                                style = ParameterStyle.FORM) Operador operador) {

        CalculadoraResponse calculadoraResponse = new CalculadoraResponse();

        calculadoraResponse.setOperando1(String.valueOf(op1));
        calculadoraResponse.setOperando2(String.valueOf(op2));
        calculadoraResponse.setOperador(operador);
        calculadoraResponse.setResultado(calculadoraService.calcular(op1, op2, operador));

        tracer.trace(calculadoraResponse.getResultado());

        return calculadoraResponse;
    }
}
