package Pkg1;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		System.out.println("Assignment 4 - Palindrome Number");
		Scanner s=new Scanner (System.in);
		System.out.println("Please enter the number to be checked");
		int a=s.nextInt();
		int c=a;
		int sum=0;
		while(a>0)
		{
		int b=a%10;
		sum=sum*10+b;
		a=a/10;
		}
		if(c==sum)
		{
			System.out.println("Its a Palindrome Numer");
		}
		else
		{
			System.out.println("Its not a Palindrome Number");
		}
	}
}
