package Pkg1;

import java.util.Scanner;

public class Table 
{
public static void main(String[] args)
{
	System.out.println("Assignment 6- Table");
	System.out.println("Enter a number for which you want to print a table");
	Scanner s=new Scanner (System.in);
	int a=s.nextInt();
	for(int i=1; i<=10; i++)
	{
		System.out.println(a +"x" +i+ "=" + a*i);
	}
	
}
}
