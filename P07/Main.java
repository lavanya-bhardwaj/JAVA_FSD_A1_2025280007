package P07;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter annual rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();

        double simpleInterest = p * r * t / 100;
        double compoundInterest = p * Math.pow(1 + r / 100, t) - p;
        double maturityAmount = p + compoundInterest;

        System.out.printf("Simple Interest   = %.2f%n", simpleInterest);
        System.out.printf("Compound Interest = %.2f%n", compoundInterest);
        System.out.printf("Maturity Amount   = %.2f%n", maturityAmount);

        sc.close();
    }
}
