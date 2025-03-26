package com.ifes.models;

public class Multiplicacao implements Operadores {

    private static Multiplicacao instance;

    private Multiplicacao() {  }

    public static Multiplicacao getInstance() {
        if (instance == null) {
            instance = new Multiplicacao();
        }

        return instance;
    }

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
    
}
