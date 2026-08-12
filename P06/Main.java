package P06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.printf("%.1f F = %.1f C%n", f, c);

        sc.close();
    }
}
