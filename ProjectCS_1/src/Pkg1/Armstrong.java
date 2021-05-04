package Pkg1;

import java.util.Scanner;

public class Armstrong 
{
public static void main(String[] args) 
{
System.out.println("Assignment 5-Armstrong");
System.out.println("Please enter the number to be checked");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=a;
int sum=0;
while(a>0)
{
int c=a%10;
sum=sum+c*c*c;
a=a/10;
}
if(b==sum)
{
	System.out.println("Its an Armstrong Numer");
}
else
{
	System.out.println("Its not an Armstrong Number");
}
}
}
