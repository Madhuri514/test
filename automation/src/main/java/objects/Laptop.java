package objects;

public class Laptop {

	//add method
	int add(int a,int b) {
		int c = a+b;
		return c;
	}
	
	//subtract method
	int subtract(int a,int b) {
		int c = a-b;
		return c;
	}
	
	//Multiplymethod
	
	int multiply(int a,int b) {
		int c = a*b;
		return c;
	}
	
	//Divide method
	float divide(int a,int b) {
		int c= a%b;
		return c;
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	
	Laptop l1 = new Laptop();
	int d = l1.add(20,30);
	System.out.println(d);
	
	int w = l1.subtract(d, d);
	System.out.println(w);	
	
	int e = l1.multiply(d, w);
	System.out.println(e);
	
	float f=l1.divide(w, e);
	System.out.println(f);
			
}
}