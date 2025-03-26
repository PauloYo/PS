package com.ifes.models;

public class Divisao implements Operadores {

    private static Divisao instance;

    private Divisao() {  }

    public static Divisao getInstance() {
        if (instance == null) {
            instance = new Divisao();
        }

        return instance;
    }

    @Override
    public double calcular(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero");
        }
        return a / b;
    }
    
}
