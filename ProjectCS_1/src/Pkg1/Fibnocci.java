package Pkg1;

import java.util.Scanner;

public class Fibnocci 
{
public static void main(String[] args) 
{
System.out.println("Assignment 8 - Fibnocci Series");
System.out.println("Please Enter the number");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=0;
int c=1;
int d=0;
for (int i=2; i<=a; i++)
	{
	d=b+c;
	System.out.println(d);
	b=c;
	c=d;
	}


}
}
