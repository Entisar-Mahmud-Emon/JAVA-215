package Class1Prac;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.print("Enter the Day Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Day Name:Saturday");
			break;
		case 2:
			System.out.println("Day Name:Sunday");
			break;
		case 3:
			System.out.println("Day Name:Monday");
			break;
		case 4:
			System.out.println("Day Name:Tuesday");
			break;
		case 5:
			System.out.println("Day Name:Wednesday");
			break;
		case 6:
			System.out.println("Day Name:Thursday");
			break;
		case 7:
			System.out.println("Day Name:Friday");
			break;
			default:
				System.out.println("Invalid Day Number!!");
		
		}
	}

}
