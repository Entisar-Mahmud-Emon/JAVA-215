package Class1Prac;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a= sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b= sc.nextInt();
		
		
		
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println("\nAddition       ="+add);
		System.out.println("Substraction   ="+sub);
		System.out.println("Multiplication ="+mul);
		System.out.println("Division       ="+div);
	}

}
