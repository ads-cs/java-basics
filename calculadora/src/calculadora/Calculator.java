package calculadora;

import java.util.Scanner;
import java.util.Locale;

public class Calculator {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        try {
            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();

            System.out.print("Digite a operação (+ - * /): ");
            char wtd = sc.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();

            switch (wtd) {
                case '+':
                    System.out.println("Resultado: " + somar(a, b));
                    break;
                case '-':
                    System.out.println("Resultado: " + subtrair(a, b));
                    break;
                case '*':
                    System.out.println("Resultado: " + multiplicar(a, b));
                    break;
                case '/':
                    System.out.println("Resultado: " + dividir(a, b));
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Entrada inválida. Use apenas números.");

        } finally {
            sc.close();
        }
    }
}


