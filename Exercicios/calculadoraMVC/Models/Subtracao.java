package Models;

public class Subtracao implements Operadores {

    private static Subtracao instance;

    private Subtracao() {  }

    public static Subtracao getInstance() {
        if (instance == null) {
            instance = new Subtracao();
        }

        return instance;
    }

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
    
}
