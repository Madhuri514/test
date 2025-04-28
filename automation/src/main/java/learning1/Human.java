package learning1;

public class Human {
	
	String name; // instance 
	int Age ;
	static String country; // shared
	
	// method - def - function
	// service -     money - restaurent - food
	//  money - cinema = entertainment
	// time effort - compnay  salary 
	// input    - service  -   output 
	// parameters - method name - return type
	
	// retrun should be the last logical statement in a method 
	
	int add (int a ,int b) {
		int z = a+b;
		System.out.println(z);
		return z;
	}
	
	int sub (int d,int e) {
		int w = d-e;
		return w;
	}
	
	// non - parameterized method
	float pi(){
		return 3.14f;	
	}
	
	// retrun type as void
	void print(String content){
		System.out.println(content);
	}
	
}

class HumanTest{
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "Madhuri";
		h1.Age = 25;
		h1.country ="India";
		
		int f = h1.add(10, 20);
		System.out.println("Result " + f);
		
		int k = h1.add(f,40);
		
		
		Human h2 = new Human();
		h2.name = "vaibhav";
		h2.Age = 33;
		h2.country ="USA";
		
		
		System.out.println(h1.country);
		
		
	}
	
}

//Hospital, patient , 
