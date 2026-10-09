
public class Principal {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisao inteira por zero");
        }

        double x = 10.0;
        double y = 0.0;

        System.out.println("Divisao real: " + (x / y));
        System.out.println("Zero dividido por zero: " + (y / y));
    }
}
