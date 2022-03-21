package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] firstarray = {3,2,11,4,6,7};
		int[] secarray = {1,2,8,4,9,7};
		for (int i = 0; i < firstarray.length; i++) {
			for (int j = 0; j < secarray.length; j++) {
				if(firstarray[i] == secarray[j]) {
					System.out.println("The Number available in both the Array is  " + firstarray[i]);
				}
				
			}
			
		}

	}

}
