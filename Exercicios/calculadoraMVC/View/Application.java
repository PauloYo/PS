package View;

public class Application {
    public static void main(String[] args) {
        System.out.println("===== Calculator =====");
        while (true) {
            Controller.Controller controller = new Controller.Controller();
            String op = controller.showMenu();
            controller.operar(op);
        }
    }
} 