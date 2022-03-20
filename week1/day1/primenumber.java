package week1.day1;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);  
		System.out.println("Get the Number");
		int a = num.nextInt();
		int end = a / 2;
		boolean flag = false;
		
		for (int i = 2; i <= end; i++) {
			int rem = a % i;
			if (rem == 0) {
				flag = true;
			}
			
		}
		
		if (flag) {
			System.out.println("The Given Number is not Prime number " + a);
			
		} else {

			System.out.println("The Given Number is Prime number " + a);	
						
		}

	}

}
