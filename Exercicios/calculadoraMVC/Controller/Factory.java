package Controller;

import Models.Operadores;
import java.lang.reflect.InvocationTargetException;

public class Factory {
        
    public static Operadores getOperador(String operador) {
        try {
            Object classeInstanciada = Class.forName("singleton.models." + operador).getDeclaredMethod("getInstance").invoke(null);
            return (Operadores) classeInstanciada;
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }  
    }
}
