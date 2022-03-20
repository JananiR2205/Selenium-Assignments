package week1.day1;

public class fibonacci {

	public static void main(String[] args) {
		
		int firstnum = 0;
		int secnum = 1;
		System.out.println("FIBONACCI SERIES");
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 0; i < 8; i++) {
			int sum = firstnum + secnum ;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
			
		}

	}

}
