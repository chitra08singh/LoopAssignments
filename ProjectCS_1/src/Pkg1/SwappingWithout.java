package Pkg1;

import java.util.Scanner;

public class SwappingWithout 
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		System.out.println("Assignment 2- Swapping without third variable");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter any two values");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("After swapping result is as follows");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	
}
}
