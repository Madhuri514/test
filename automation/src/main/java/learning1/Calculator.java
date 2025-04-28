package learning1;

public class Calculator {
	
	// Static method - class level entity
	
	// non-static instance method
	static int add (int a,int b) {
		int c= a+b ;
		return c;
	}
	
	
	
	static int multiply(int a,int b) {
		int c = a*b ;
		return c;
	}
	
	// divide
	// square
	// cube 
	// square root
	// area of circle
	
	//divide method
	static float divide(int a,int b) {
		float c = a%b ;
		return c;
	}
	//square method
	static int square(int a) {
		int c = a*a ;
		return c;
	}
	//cube method
	static int cube(int a) {
		int c = a*a*a ;
		return c;
	} 
	
	//squareroot method
	static double squareroot(double a) {
		double c = Math.sqrt(a);
		return c ;
	}

	//area of circle method
	static double areaofcircle(double a) {
		double c = Math.PI*(a*a);
		return c;
	}
	
	//subtract method
	static int subtract(int a,int b,int c){
	int d = a-b-c;
	return d ;
	
	}
	

}
