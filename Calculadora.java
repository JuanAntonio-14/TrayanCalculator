import java.util.Scanner;

public class Calculadora {

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Suma y Resta");
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("¿Sumar (+) o Restar (-)?: ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Resultado: " + suma(num1, num2));
        } else if (op == '-') {
            System.out.println("Resultado: " + resta(num1, num2));
        } else {
            System.out.println("Operación no válida");
        }

        sc.close();
    }
}
