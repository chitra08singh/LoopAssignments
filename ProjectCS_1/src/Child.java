
public class Child extends Method
{
		public void Kid1()
		{
			System.out.println("Child default method" );
		}
		public void Kid1(int a, int b)
		{
			super.Method5();
			this.Method3(3, 4, 5, 2);
			this.Method4(6);
			this.Method1(2, 3);
			this.Method2(11, 12, 13);
			this.Kid1();
			this.Kid1(1, 2, 3, 4);
			this.Kid1(1, 2, 3);
			this.Kid1(1);
			System.out.println("Child two parameterized method" );
		}
		public void Kid1(int a)
		{
			System.out.println("Child one parameterized method" );
		}
		public void Kid1(int a, int b, int c)
		{
			System.out.println("Child three parameterized method" );
		}
		public void Kid1(int a, int b, int c, int d)
		{
			System.out.println("Child four parameterized method" );
		}
		public static void main(String[] args) 
		{
			Child ref=new Child();
			ref.Kid1(11, 12);
		}
	}

