package week1.day2;

import java.util.Arrays;

public class missingElementArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8,10};
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[i-1] !=1) {
				int miss=arr[i-1] + 1;
			System.out.println("The Missing Number is  " + miss );
			
		}

	}
}
	
}


