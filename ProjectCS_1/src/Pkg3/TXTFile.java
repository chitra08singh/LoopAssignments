package Pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TXTFile 
	{
		public void ReadData(int a) throws IOException
		{
			File f=new File("../ProjectCS_1/src/Pkg3/Assignments-8May.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String r;
			int b=0;
			while ((r=br.readLine())!=null)
			{
				b++;
				if(b==a)
				{
				System.out.println(r);
				}
			}
		}
		public static void main(String[] args) throws IOException 
		{
		System.out.println("Please enter the row number : ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		TXTFile tf=new TXTFile();
		tf.ReadData(num);
		}
	}