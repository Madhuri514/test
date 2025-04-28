package learning1;

public class Patients {
	
String name; //instance variable
int Age; //instance variable
String Gender; //instance variable
static int Zipcode; //shared variable
}
class PatientsfromHospitals{
public static void main(String[] args) {
	

Patients p1 = new Patients();
Patients p2 = new Patients();
Patients p3 = new Patients();

p1.name = "Raju";
p1.Age = 29;
p1.Gender = "Male";

p2.name = "Khoshal";
p2.Age = 31;
p2.Gender = "Male";
p2.Zipcode = 7503 ;

p3.name = "Rani";
p3.Age = 20;
p3.Gender = "Female";
p3.Zipcode = 7234 ;

System.out.println(p1.name);
System.out.println(p2.Zipcode);
//System.out.println(p3.Zipcode);
}
}
