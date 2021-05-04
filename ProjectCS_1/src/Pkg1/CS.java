package Pkg1;

public class CS {
	public CS()
	{
		this(11,12,13);
		System.out.println("Parent default Constructor");
	}
	public CS(int a)
	{
		this();
		System.out.println("Parent One Paramterized Constructor");
	}
	public CS(int a, int b)
	{
		this(11,12,13,14);
		System.out.println("Parent Two paremeterized Constructor");
	}
	public CS(int a, int b, int c)
	{
		System.out.println("Assignment -1 Date : 10 April, 2021");
		System.out.println("Parent Three Parameterized Constructor");
	}
	public CS(int a,int b, int c, int d)
	{
		this(11);
		System.out.println("Parent Four Parameterized Coinstructor");
	}
	}

