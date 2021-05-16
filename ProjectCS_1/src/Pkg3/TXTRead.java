package Pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TXTRead {
	public void ReadDataofRange(int firstrow, int endrow) throws IOException
	{
		File f=new File("../ProjectCS_1/src/Pkg3/Assignments-8May.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String p; int b=0;
		while ((p=br.readLine())!=null)
		{
			b++;
			if((b>=firstrow)&&(b<=endrow))
			{
				System.out.println(p);
			}
		}
		
	}
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Please enter First and Last row numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=s.nextInt();
		TXTRead tr=new TXTRead();
		tr.ReadDataofRange(a, c);
	}

}
