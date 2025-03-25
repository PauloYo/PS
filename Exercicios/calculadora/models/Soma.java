package calculadora.models;

public class Soma implements Operadores {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}