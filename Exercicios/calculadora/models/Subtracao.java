package calculadora.models;

public class Subtracao implements Operadores {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}