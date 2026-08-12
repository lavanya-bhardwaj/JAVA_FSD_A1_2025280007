package P08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Ternary operator only - no if statement
        String parity = (n % 2 == 0) ? "Even" : "Odd";
        int lastDigit = Math.abs(n) % 10;

        System.out.println(parity);
        System.out.println("Last digit: " + lastDigit);

        sc.close();
    }
}
