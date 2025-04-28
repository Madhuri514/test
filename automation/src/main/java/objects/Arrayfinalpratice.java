package objects;

import java.util.Arrays;

public class Arrayfinalpratice {
	
	public static void main(String[] args) {
		
		// Reverese print:
		
		int[] a= {10,5,7,8,9};
		System.out.println("Print in the revrse format:");
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}
		
	// Max value in the array
		
		int[] b = {2,5,7,38};
		int max = b[0];
		for(int i = 1; i<b.length;i++) {
			if(b[i]>max) {
				max = b[i];
			}
		}
		System.out.println("Print the max value:" + max);
		
	//Min value in the array
		
		int[] c= {2,0,34,87};
		int min = c[0];
		for(int i =1; i<c.length;i++) {
			if(c[i]<min) {
				min = c[i];
			
			}
		}
		System.out.println("print the min value" +min);
		
		//Duplicates in the list:
		
		int[] d = {4,8,0,8,5,5,2};
		System.out.println("print the duplicate values");
		for(int i = 0;i<d.length-1;i++) {
			for(int j= i+1;j<d.length-1;j++) {
				if(d[i]==d[j]) {
					System.out.println(d[i]);
				}
			}
		}
	//create a new array list:	
		int[] orginal = {10,70,50,60,20};
		
	//step 1: sort the array list:
		Arrays.sort(orginal);
		
		
	}


}
