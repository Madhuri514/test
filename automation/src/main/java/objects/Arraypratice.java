package objects;

import java.util.Arrays;

public class Arraypratice {
	public static void main(String[] args) {
		
//Print in the reverse:
		
		int[] x = {10,20,30,40,50};
		System.out.println("Reversed print:");
		for(int i = x.length-1;i>=0;i--) {
			System.out.print(x[i]+ " ");
			
		}
		
//Max value in the array list:
		
		int[] y = {10,6,8,2,6};
		int max = y[0];
		for(int i=1;i<y.length;i++) {
			if(y[i]>max) {
				max=y[i];
			}
		}
		
		System.out.println("Maximum value in the array: " + max);
		
//Min value in the Array list:
		
		int[] arr = {25, 14, 56, 32, 8, 19};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value in the array: " + min);
        
    //find out duplicate values:
        
        int[] arr1 = {4, 7, 2, 4, 9, 7, 1};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[i]);
                    break; // Avoid printing the same duplicate again
                }
            }
        }
     //  create new array with alternate index and sort them as well.
        
        int[] original = {40, 10, 60, 30, 50, 20};

        // Step 1: Sort the array
        Arrays.sort(original);

        // Step 2: Create a new array with alternate indices from sorted array
        int newSize = (original.length + 1) / 2;
        int[] alternate = new int[newSize];

        int j = 0;
        for (int i = 0; i < original.length; i += 2) {
            alternate[j++] = original[i];
        }

        // Print results
        System.out.println("Sorted Array: " + Arrays.toString(original));
        System.out.println("Alternate Index Elements: " + Arrays.toString(alternate));   
        
	}
	
	

}
