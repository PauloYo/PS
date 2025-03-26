package com.ifes.controller;

import com.ifes.models.Operadores;

public class Controller {

    public Operadores searchOperator(String op) {
        return Factory.getOperador(op);
    }

    public double operar(Operadores op, double a, double b) throws ArithmeticException {
        try {
            return op.calcular(a, b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Erro: Divisão por zero\n");
        }
    }
}
