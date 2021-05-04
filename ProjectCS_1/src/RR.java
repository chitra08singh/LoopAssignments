
public class RR {
	public RR()
	{
		this(11);
		System.out.println("default Constructor");
	}
	public RR(int a)
	{
		this(2,7,8,9);
		System.out.println("One Paramterized Constructor");
	}
	public RR(int a, int b)
	{
		this(33,44,55);
		System.out.println("Two paremeterized Constructor");
	}
	public RR(int a, int b, int c)
	{
		this();
		System.out.println("Three Parameterized Constructor");
	}
	public RR(int a,int b, int c, int d)
	{
		System.out.println("Four Parameterized Coinstructor");
	}
	public static void main(String[] args) {
		RR r=new RR(2,3);
	}
}
