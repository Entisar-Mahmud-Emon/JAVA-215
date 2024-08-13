package Class1Prac;

import java.util.Scanner;

public class prac_05_mul_table {
public static void main(String[] args) {
	System.out.print("Enter the number of Multiplication Table:");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	System.out.println();
	for(int j=1;j<=k;j++)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(j+" X "+i+"="+(j*i));
		}
		System.out.println("");
	}
	
	
}
}
