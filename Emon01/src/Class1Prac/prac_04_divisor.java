package Class1Prac;

import java.util.Scanner;

public class prac_04_divisor {
	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean notComma = true;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0 && notComma)
				
			{System.out.print("|");
				System.out.print(i);
			notComma=false;}
			else if(a%i==0)
			{System.out.print(","+i);}
		}
		System.out.print("|");
		
	}

}
