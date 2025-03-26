package com.ifes.controller;

// Ensure the correct package is imported
import com.ifes.models.Operadores;
import java.lang.reflect.InvocationTargetException;

public class Factory {
        
    public static Operadores getOperador(String operador) {
        try {
            operador = operador.substring(0, 1).toUpperCase() + operador.substring(1).toLowerCase();
            Object classeInstanciada = Class.forName("com.ifes.models." + operador).getDeclaredMethod("getInstance").invoke(null);
            return (Operadores) classeInstanciada;
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return null;
        }
    }
}
