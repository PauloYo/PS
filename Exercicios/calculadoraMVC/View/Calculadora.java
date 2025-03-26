package View;

import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;
import Controller.Controller;
import Models.Operadores;

public class Calculadora {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Menu");
        System.out.println("- Soma");
        System.out.println("- Subtracao");
        System.out.println("- Multiplicacao");
        System.out.println("- Divisao");
        System.out.println("- Sair");

        System.out.println("Escolha uma opção: ");
        String op = scanner.nextLine().toLowerCase();
        op = op.substring(0, 1).toUpperCase() + op.substring(1).toLowerCase();

        Operadores operador;

        if (op.equals("Sair")) {
            System.out.println("Bye bye.");
        } else {
            try {
                operador = controller.searchOperator(op);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                System.out.println("Erro: " + ex.getMessage());
                return;
            }
        }
        
        System.out.println("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o segundo número: ");
        double b = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        
        double result = controller.operar(operador, a, b)
        System.out.println();
    }
} 