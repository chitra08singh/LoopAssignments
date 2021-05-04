package Pkg1;

import java.util.Scanner;

public class Prime 
{

	public static void main(String[] args) 
	{
		int a=0;
		System.out.println("Assignment 3- Check for Prime Number");
		System.out.println("Please enter any number");
		Scanner s=new Scanner (System.in);
		int number=s.nextInt();
		for(int i=2; i<=number/2; i++)
		{
			if(number%i==0)
			{
				System.out.println(number +" is not a prime numnber" );
				a=1;
				break;
			}
		}
		if(a==0) 
		{
			System.out.println(number + " is a prime numnber");
		}
	}
}
