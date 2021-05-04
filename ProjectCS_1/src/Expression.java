import java.util.Scanner;

public class Expression 
{
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Final answer is ="+c );
		return c;
	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum would be ="+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Subtration result is ="+c);
		return c;
	}
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Division result is ="+c);
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Assignment-2 Date : 11 April 2021");
		System.out.println("((((x1-x2)+x3)-x4)/x5)*x6)");
		System.out.println("Please enter the value for x1");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Please enter the value for x2");
		int b=s.nextInt();
		System.out.println("Please enter the value for x3");
		int c=s.nextInt();
		System.out.println("Please enter the value for x4");
		int d=s.nextInt();
		System.out.println("Please enter the value for x5");
		int e=s.nextInt();
		System.out.println("Please enter the value for x6");
		int f=s.nextInt();
		
		Expression p=new Expression();
		int result1=p.sub(a, b);
		int result2=p.sum(result1, c);
		int result3=p.sub(result2, d);
		int result4=p.div(result3, e);
		int result5=p.mul(result4, e);
		}
}



