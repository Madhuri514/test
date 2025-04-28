package learning1;

public class ConstructorDemo {
public static void main(String[] args) {
	Sport sport1 = new Sport("Hockey","INdia");
	Sport sport2 = new Sport("Baseball", "USA");
	
}
}



class Sport{
	
	String sportName;
	String sportNationalCountry;
	// 1 - name must be same as class name
	// 2 - no return type
	// usually used for instance variable initalization
	Sport(String sportNameValue, String sportCountry){
		sportName = sportNameValue;
		sportNationalCountry = sportCountry;
	}
	
	
}
