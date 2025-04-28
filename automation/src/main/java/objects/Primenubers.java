package objects;

public class Primenubers {
	
	    public static void main(String[] args) {
	    	int limit = 100;
	    	System.out.println("print prime number 1 to " +limit);
	    	
	    	for(int i =1;i<100;i++)
	    	{
	    	boolean isprime = true;
	        for (int j=2;j<i;j++ )
	        {
	        	if(i%j==0) {
	        		isprime= false;
	        		break;
	        	}
	        }
	        
	        if(isprime)
	        	System.out.println(i+"");
	    	}
			
		}
	}



