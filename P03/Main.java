package P03;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
	    System.out.print("Enter b: ");
	    int b = sc.nextInt();
	 
	    System.out.println("\nBefore swap: a = " + a + ", b = " + b);
	 
	        
	    a = a + b;   // a now holds sum of both
	    b = a - b;   // b becomes original a
	    a = a - b;   // a becomes original b
	 
	    System.out.println("After swap:  a = " + a + ", b = " + b);
	 
	    sc.close();
	}

}
