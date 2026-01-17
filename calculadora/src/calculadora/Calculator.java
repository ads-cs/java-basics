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
        else return a / b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        sc.nextLine();

        System.out.print("Digite a operação (+ - * /): ");
        char wtd = sc.nextLine().charAt(0);

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        switch(wtd) {

            case '+':
                System.out.println(somar(a, b));
                break;
            case '-':
                System.out.println(subtrair(a, b));
                break;
            case '*':
                System.out.println(multiplicar(a, b));
                break;
            case '/':
                System.out.println(dividir(a, b));
                break;
            default:
                System.out.println("SIMBOLO INVALIDO");
                break;

        }
        sc.close();
        }


    }

