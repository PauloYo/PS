package com.ifes;

import java.util.Scanner;
import com.ifes.view.Calculadora;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean running = true;

        while (running) {
            running = calculadora.showView(scanner);
        }

        scanner.close();
    }
}
