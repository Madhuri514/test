package objects;

public class Fibanoccipratice {
	public static void main(String[] args) {
		
		int n= 50;
		int a =0,b=1;
		
		System.out.println("febanocci series" + n + "terms:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a+"");
			int c= a+b;
			a=b;
			b=c;
		}
		
	}

}
