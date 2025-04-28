package learning1;

public class InheritanceDemo {
public static void main(String[] args) {
	
	C c1 =new C();
	c1.m1();
	// Inheritance Demo class HAS-A Animla object
	// HAS-A Relationship
	
}
}
// Overriding
//
class A{
	int i= 10;
	public void m2() {
		
	}
}

class B extends A{
	int i = 20;
	int j = super.i;
	public void m2() {
		
	}
}

class C extends B{
	public void m1() {
		System.out.println(i);
		System.out.println(j);
		m2();
	}
}
// multi level interitance 
 

// Multiple Inheritance - When one class trying to extends more then 1 class
// state of ambiguity - not allowed


// Unidirectional - parent attribute come to child. child not inofromation shoared to pared
// if varibale/ method is private , , it wont pass to child
// if class is final , then we cannot inherit that class
// Inheritance - which provide all parent class method/variable directly to child class
// extends
