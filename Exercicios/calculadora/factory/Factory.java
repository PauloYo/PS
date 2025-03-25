package calculadora.factory;

import java.lang.reflect.*;

import calculadora.models.Operadores;

public class Factory {

    public static Operadores factory(String nome) {
        try {
            Object classeInstanciada = Class.forName("calculadora.models." + nome).getDeclaredConstructor().newInstance();
            return (Operadores) classeInstanciada;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }
}
