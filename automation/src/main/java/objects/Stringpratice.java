package objects;

public class Stringpratice {
public static void main(String[] args) {
	
//How many characters in string
	String x = "Madhuri";
	System.out.println(" charactes in string:" + x.length());
//How many words in string
	
	String y = "Hi how are you ?";
	System.out.println("words in string:" +y.split(" ").length);
	
//How many vowels in string
	
	String z= "Gemini";
	System.out.println("vowels in string:" +z.replaceAll("[^aeiouAEIOU]", "").length());

//How many numbers in the string
	String a= "Hdfc123";
	System.out.println("Numbers in the string:" +a.replaceAll("[^0-9]", "").length());
	
//Revere string
	String b= "abc";
	System.out.println("Reverse string:"  + new StringBuilder(b).reverse().toString());
	// do reverse using for loop

	
// Reversing a string with for loop concept:
	String original = "hello";
    String reversed = "";

    for (int i = original.length() - 1; i >= 0; i--) {
        reversed += original.charAt(i);  // adding each character in reverse order
    }

    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);
    
 //Praticing:
    String orginal1= "Rowdy";
    String reverse1= "";
    
    for(int i = orginal1.length()-1;i>=0;i--) {
    	reverse1 += orginal1.charAt(i);
    }
    System.out.println("Orginal:" +orginal1);
    System.out.println("Reverse :" +reverse1);
    
    
    
    
    
}



}
