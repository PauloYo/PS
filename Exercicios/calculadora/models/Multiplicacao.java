package calculadora.models;

public class Multiplicacao implements Operadores {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}