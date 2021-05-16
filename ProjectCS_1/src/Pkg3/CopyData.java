package Pkg3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData 
{
	public static void main(String[] args) throws Exception 
	{
	File f1=new File("../ProjectCS_1/src/Pkg3/Assignments-8May.txt");
	FileReader fr=new FileReader(f1);
	BufferedReader bf=new BufferedReader(fr);
	
	File f2=new File("../ProjectCS_1/src/Pkg3/OutputFile.txt");
	FileWriter fw=new FileWriter(f2);
	BufferedWriter bw=new BufferedWriter(fw);
	
	String p;
	while((p=bf.readLine())!=null)
	{
		bw.write(p);
		bw.newLine();
	}
	bf.close();
	bw.close();
	}
}

