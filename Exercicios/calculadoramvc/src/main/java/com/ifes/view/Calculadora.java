package com.ifes.view;

import java.util.Scanner;
import java.util.InputMismatchException;
import com.ifes.models.Operadores;
import com.ifes.controller.Controller;

public class Calculadora {
    public boolean showView(Scanner scanner) {
        Controller controller = new Controller();

        System.out.println("Menu");
        System.out.println("- Soma");
        System.out.println("- Subtracao");
        System.out.println("- Multiplicacao");
        System.out.println("- Divisao");
        System.out.println("- Sair");
        
        // Escolha uma opção
        System.out.print("Escolha uma opção: ");
        String op = scanner.nextLine().trim();
        
        // Encerra o programa
        if (op.equalsIgnoreCase("Sair")) {
            System.out.println("\nBye bye.");
            return false;
        }

        Operadores operador = controller.searchOperator(op);

        if (operador == null) {
            System.out.println("Operador não encontrado.\n");
            return true;
        }
        
        try {
            System.out.print("\nDigite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            double result = controller.operar(operador, a, b);
            System.out.println("Resultado: " + result + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número válido.\n");
            scanner.nextLine(); // Limpa o buffer
            return true;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            scanner.nextLine(); // Limpa o buffer
            return true;
        }

        scanner.nextLine(); // Limpa o buffer
        return true;
    }
} 