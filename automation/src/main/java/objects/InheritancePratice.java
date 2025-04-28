package objects;

public class InheritancePratice {
	public static void main(String[] args) {
		India obj = new India();  // create object of subclass
		obj.m4();	  
		
	}

}

class Dallas{
	String Area = "Frsico";
	String Model ="townhome";
	
}

class Boston extends Dallas{
	String Area = "Bellingham";
	String Model = "singlehome";
	String Goodarea = super.Area;
	
}

class India extends Boston{
	public void m4() {
		System.out.println(Area);
		System.out.println(Model);
		System.out.println(Goodarea);
		// TODO Auto-generated method stub

	}
}




//India obj = new India();  // create object of subclass
//obj.m4();