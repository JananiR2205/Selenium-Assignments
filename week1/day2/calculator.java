package week1.day2;
import java.util.Scanner;


public class calculator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
		
	}
	public double sub(double a, double b) {
		double c = a - b;
		return c;
		
	}
	public double multiply(double a, double b) {
		double c = a * b;
		return c;
		
	}
	public int div(int a, int b) {
		int c = a / b;
		return c;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Get the first number");
		int a = sc.nextInt();
		System.out.println("Get the second number");
		int b = sc.nextInt();
    calculator calc = new calculator();
    System.out.println("Addition : " + calc.add(a, b));
    System.out.println("Subtraction : " + calc.sub(a, b));
    System.out.println("Multiply : " + calc.multiply(a, b));
    System.out.println("Divide : " + calc.div(a, b));

	}

}
