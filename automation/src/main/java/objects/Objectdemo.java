package objects;

public class Objectdemo {
	
public static void main(String[] args) {
	Human h1 = new Human();
	Human h2 = new Human();
	Human h3 = new Human();
	h1.name = "Madhuri";
	h1.height = 160;
	h1.color = "fair";
	h1.gender = "Female";
	h2.name ="Ram";
	h3.name ="shyam";
	h1.talk("Hi");
	h2.talk("Hi,I am good");
	
}
	
}






// Object ?

// Pen = attribute  = length, width, color
// behaviour = write 

// attribute  + behaviour = Object

// laptop = color, wisth, hight, model ,    behaviour = calcualte, watrh moview, work 



// Human = gender,height,color behaviour = talk,watch,eat,sleep
//  int, float, boolan , char, String , 
class Human{
	String gender;
	int height;
	String color;
	String name;
	
	void talk(String content) {
		System.out.println(name + " : " + content);
	}
}



