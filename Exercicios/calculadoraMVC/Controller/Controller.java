package Controller;

import Models.Operadores;

public class Controller {

    public Operadores searchOperator(String op) {
        return Factory.getOperador(op);
    }

    public double operar(Operadores op, double a, double b) {
        return op.calcular(a, b);
    }
}
