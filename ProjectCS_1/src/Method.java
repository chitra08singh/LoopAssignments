public class Method
{
	public void Method1(int a, int b)
	{
		System.out.println("Parent two parameterized method");
	}
	public void Method2(int a, int b, int c)
	{
		System.out.println("Parent three parameterized method");
	}
	public void Method3(int a, int b, int c, int d)
	{
		System.out.println("Parent four parameterized method");
	}
	public void Method4(int a)
	{
		System.out.println("Parent one parameterized method");
	}
	public void Method5()
	{
		System.out.println("Assignment-2 Date : 10 April 2021");
		System.out.println("Parent default method");
	}
	public static void main(String[] args) 
	{
		Method m=new Method();
		m.Method1(2, 5);
	}
}


