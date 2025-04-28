package learning1;

public class CallDemo {

	
	
	
	public static void main(String[] args) {
		Mark m1  = new Mark();
		m1.k = 2;
		System.out.println("Before : " + m1.k); // 2
		changeValue(m1);
		System.out.println("After : " + m1.k); // 10
	}
	
	
	public static void changeValue(Mark mObject ) {
		mObject.k = 10;
	}
}

// Call By Ref = When we call Objects
// Call By Value = When we call Datatypes (int, float)

class Mark{
	int k;
}