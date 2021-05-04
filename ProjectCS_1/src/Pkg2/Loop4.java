package Pkg2;

public class Loop4 {
	public static void main(String[] args) 
	{
		System.out.println("Assignment 4 : 24 Apr");
		
		int a=0;
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				a++;
				System.out.print(a);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
