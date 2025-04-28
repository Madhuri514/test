package learning1;

public class ArrayDemo {
	public static void main(String[] args) {
		// Why do we need arrays ?
		
		// class teacher
		// roll1 - 100  , math, sceince, gk, sst, arts
		// mark for each student in each subject
		
		int roll_1_math = 34;
		int roll_1_science = 45;
		int roll_1_gk = 67;
		int roll_1_sst = 89;
		int roll_1_arts = 67;
		
		int[] roll1_marks =  {34,45,67,89,78};
		
		int[] k = new int[5];
		k[0] = 67;
		k[1] = 78;
		k[2] = 100;
		k[3] = 67;
		k[4] = 89;
	
		System.out.println(k.length);
	
		
		
		for(int r1 : k) {
			System.out.println(r1);
		}
		
		int[] roll2_marks =  {45,67,78,12,89};
		
		
		
		
		System.out.println(roll1_marks[2]);  //67
		roll1_marks[3] = 100;
		System.out.println(roll1_marks[2]); // 100
		
		
		// arrays always starts from 0
		
		
		// 2D-Array = Excel sheet
		
		int[][] allStudentMarks = {
				{34,45,67,89,67},	
				{45,67,78,12,89}
		};
		//System.out.println(allStudentMarks[0][4]);
		
		//  how do we iterate arrays = 
		
		// 1 - Reverse the array  
		// '[1,3,4,4,5,7] -> [7,5,4,4,3,1]
		
		// 2 - Find max in array
		// = 7
		
		// 3 - Find min in array
		// 1
		
		// Find Duplicate in array
		// 4
		
		// create new array with alternate index
		// [1,4,5]
		
		// sort
		// [1,6,3,6,9]
		// sort and then alternate index
		// [1,3,6,6,9] => [1,6,9]
		
		/*
		 * int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Reversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        
        //max num array:
        int[] arr = {15, 22, 9, 38, 44, 3};

        int max = arr[0]; // Assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        System.out.println("Maximum value in the array: " + max);
		 */
	}

}
