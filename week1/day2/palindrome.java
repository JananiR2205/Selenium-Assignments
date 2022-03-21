package week1.day2;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the Text");
		Scanner sc=new Scanner(System.in); 
		String name = sc.nextLine();
		String rev = "";
		int len = name.length();
		for (int i = len-1; i >= 0; i--) {
			rev = rev + name.charAt(i);			
		}
		if (name.equals(rev)) {
			System.out.println("The Given Text is Palindrome " + name);
			
		}else {
			System.out.println("The Given Text is NOT Palindrome " + name);
		}
		

	}

}
