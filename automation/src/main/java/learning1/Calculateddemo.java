package learning1;

public class Calculateddemo {
	public static void main(String[] args) {
		
		int f = Calculator.add(20, 30);
		System.out.println(f);
		
		
		//Calculator  c1 = new Calculator();
		int g = Calculator.multiply(f, f);
		System.out.println(g);
		
		double h = Calculator.squareroot(81);
		System.out.println(h);
		
		int j = Calculator.cube(3);
		System.out.println(j);
		
		int l = Calculator.square(g);
		System.out.println(l);	
		
		float t = Calculator.divide(67, 3);
		System.out.println(t);
		
		double v = Calculator.areaofcircle(6);
		System.out.println(v);
		
		int m = Calculator.subtract(g, j, l);
		System.out.println(m);
	}

}
