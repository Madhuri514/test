package learning1;

public class StringDemo {
	public static void main(String[] args) {
		// String = 95% 
		// String - special memory system - String-pool
		
		
		// Immutability - once string is created , then we cant change String Object. if we update Sting, it will create new object in sting pool
		
		
		// How many object are there in memory ?
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		
//		== Check Equality , ref
		
		//System.out.println(s1 == s2); // true
		//System.out.println(s2 == s3); // false
		//System.out.println(s3 == s4); // false
		
		// String Methods
		
		String input = "My name is Khan";
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
		System.out.println(input.charAt(4));
		System.out.println(input.indexOf('m'));
		
		// vaibahv4537x5h2k
		
		// Howmany letters are there in String? = 
		// How many words are there in String; = 1
		// How many vowel (a,e,i,o,u) are there in string = 3
		// How many number are there in strng = 6
		// reverse string
	
	}
}
