
public class CS2{
	public int sum(int x1, int x2)
	{
		int x3;
		x3=x1+x2;
		System.out.println("Sum result is "+x3);
		return x3;
	}
	public int sub(int x3, int x2)
	 	{
	 		int c;
	 		c=x3-x2;
	 		System.out.println("Sub result is "+c);
	 		return c;
	 	}
	public int mul(int m1, int m2)
 	{
 		int n;
 		n=m1*m2;
 		System.out.println("Multiplication result is "+n);
 		return n;
 	}
	public int div(int s1, int s2)
 	{
 		int t;
 		t=s1/s2;
 		System.out.println("Final answer is "+t);
 		return t;
 	}
	public static void main(String[] args)
	{
		System.out.println("2nd Assignment");
		System.out.println("((((10+2)+2)-2)*2)/2)");
		CS2 s=new CS2();
		int sum1=s.sum(10,2);
		int sum2=s.sum(sum1, 2);
		int sub=s.sub(sum2, 2);
		int mul=s.mul(sub,2);
		s.div(mul, 2);
		}

}
