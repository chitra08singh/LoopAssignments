package Pkg1;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
	int a=1;
	System.out.println("Assignment 7-Factorial");
	System.out.println("Enter the value of your choice");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	for(int i=b; i>=1; i--)
	{
		a=a*i;
		System.out.println("Factorial of the "+ b + a);
		s.close();
	}
	}
}
