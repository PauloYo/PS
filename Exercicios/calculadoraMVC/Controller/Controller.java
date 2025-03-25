package Controller;

import java.util.Scanner;
import Models.Operadores;

public class Controller {
    private Scanner scanner = new Scanner(System.in);

    public String showMenu() {
        System.out.println("Menu");
        System.out.println("- Soma");
        System.out.println("- Subtracao");
        System.out.println("- Multiplicacao");
        System.out.println("- Divisao");
        System.out.println("- Sair");

        System.out.println("Escolha uma opção: ");
        return scanner.nextLine().toLowerCase();
    }

    public void operar(String op) {
        op = op.substring(0, 1).toUpperCase() + op.substring(1).toLowerCase();
        Operadores operador = Factory.getOperador(op);
        if (operador == null) {
            System.out.println("Operador inválido");
            return;
        } else if (op.equals("Sair")) {
            System.exit(0);
        }
        
        System.out.println("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o segundo número: ");
        double b = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        try {
            double resultado = operador.calcular(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
    }
}
