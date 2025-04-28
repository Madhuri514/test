package objects;

public class Patients {
	
String name; //instance variable
int Age;
String Gender;
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

p3.name = "Rani";
p3.Age = 20;
p3.Gender = "Female";


}
}
