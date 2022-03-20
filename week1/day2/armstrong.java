package week1.day2;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Get the Number");
		int input = sc.nextInt();
		int temp = input;
		int sum = 0;
		while (temp > 0) {
			int rem = temp%10;
			sum = sum +(rem*rem*rem);
			temp = temp / 10;			
		}
		if (input == sum) {
			System.out.println("The Given Number is Armstrong Number  " + input);			
		} else {
			System.out.println("The Given Number is NOT Armstrong Number  " + input);

		} 
						
			}
		
	}


