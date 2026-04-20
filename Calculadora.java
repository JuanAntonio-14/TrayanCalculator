import java.util.Scanner;

public class Calculadora {

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static String dividir(double a, double b) {
        if (b != 0) {
            return "Resultado: " + (a / b);
        } else {
            return "Error: No se puede dividir entre 0";
        }
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Multiplicación y División");
        System.out.println("Calculadora de Suma y Resta");
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
      
        System.out.print("¿Multiplicar (*) o Dividir (/)? ");
        char op = sc.next().charAt(0);

        if (op == '*') {
            System.out.println("Resultado: " + multiplicar(num1, num2));
        } else if (op == '/') {
            System.out.println(dividir(num1, num2));
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
