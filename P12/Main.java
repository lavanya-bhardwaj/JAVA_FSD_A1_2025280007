package P12;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+ - * / %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", a, b, a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, a / b);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%.2f %% %.2f = %.2f%n", a, b, a % b);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
