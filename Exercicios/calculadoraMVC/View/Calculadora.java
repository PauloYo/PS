package View;

public class Calculadora {
    public static void run() {
        System.out.println("===== Calculator =====");
        while (true) {
            Controller.Controller controller = new Controller.Controller();
            String op = controller.showMenu();
            controller.operar(op);
        }
    }
} 