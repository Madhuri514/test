package objects;

public class Fibonacciseries {
	 public static void main(String[] args) {
	        int n = 10; // You can change this to print more/less terms
	        int a = 0, b = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	 
}

