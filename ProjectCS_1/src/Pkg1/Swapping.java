package Pkg1;

import java.util.Scanner;

public class Swapping 
{
	public static void main(String[] args) 
	{
		int a;
		int b;
		int c;
		System.out.println("Assignment1 - Swapping using third variable");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter any two numbers");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("After swapping result is as follows");
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
	}
}
