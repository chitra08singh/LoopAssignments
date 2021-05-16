package Pkg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
	public void WDR(int initial, int end) throws IOException
	{
		File f=new File ("../ProjectCS_1/src/Pkg3/OutputFile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bf=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		String p; int i=0;
		for(i=1; i<=initial; i++);
		{
			bf.newLine();
		}
		for(i=initial; i<=end; i++) 
		{
			if(i>=initial && i<=end);
				{
					p=s.nextLine();
					bf.write(p);
					bf.newLine();
				}
		}
		bf.close();
	}
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Please enter 2 integer values to print the data for rows");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		Write w=new Write();
		w.WDR(a,b);
	}

}
