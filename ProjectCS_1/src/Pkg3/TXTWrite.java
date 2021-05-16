package Pkg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TXTWrite {
	public void WriteData(int a) throws IOException
	{
		File f=new File("../ProjectCS_1/src/Pkg3/OutputFile.txt" );
		FileWriter fw=new FileWriter(f);
		BufferedWriter bf=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		String p; 
		int c;
		
		for(c=1; c<=a; c++)
			{
				System.out.println("Please start typing: ");
				p=s.nextLine();
				bf.write(p);
				bf.newLine();
				System.out.println(p);
			}
			bf.close();
	}

	public static void main(String[] args) throws IOException 
	{
		System.out.println("How many rows do you require");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		TXTWrite tw=new TXTWrite();
		tw.WriteData(x);
	}
}
