package P04;

public class Main {
    public static void main(String[] args) {
    	int i = 100;
        long l = i; 
        double d = l;   
        System.out.println("Widening int -> long -> double:");
        System.out.println("  int    i = " + i);
        System.out.println("  long   l = " + l + "  (from int)");
        System.out.println("  double d = " + d + "  (from long)");

        double price = 9.78;
        int truncated = (int) price;
        System.out.println("\nNarrowing double -> int:");
        System.out.println("  double price     = " + price);
        System.out.println("  int    truncated = (int) price = " + truncated);


        char ch = 'A';
        int code = ch; 
        int n = 66;
        char fromInt = (char) n; 
        System.out.println("\nchar <-> int conversions:");
        System.out.println("  char ch          = '" + ch + "'");
        System.out.println("  int  code        = (int) ch = " + code);
        System.out.println("  int  n           = " + n);
        System.out.println("  char fromInt     = (char) n = '" + fromInt + "'");
    }
}
