package Pkg1;

public class CS1 extends CS
{
	public CS1()
	{
		super(11,12);
		System.out.println("Child default Constructor");
	}
	public CS1(int a)
	{
		this(11,12,13);
		System.out.println("Child one Paramterized Constructor");
	}
	public CS1(int a, int b)
	{
		this(11);
		System.out.println("Child two paremeterized Constructor");
	}
	public CS1(int a, int b, int c)
	{
		this();
		System.out.println("Child three Parameterized Constructor");
	}
	public CS1(int a,int b, int c, int d)
	{
		this(12,13);
		System.out.println("Child four Parameterized Coinstructor");
	}
	public static void main(String[] args) 
	{
	 CS1 obj=new CS1(11,12,13,14);
	}
	
}
