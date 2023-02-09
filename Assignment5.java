package com.sk.filesHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		File file=new File("D:\\sripal\\T++A51\\read\\sample1.txt");
		File file2=new File("D:\\sripal\\T++A51\\read\\sample2.txt");
		File file3=new File("D:\\sripal\\T++A51\\read\\target.txt");
		if(!file.exists())
			file.createNewFile();
		if(!file2.exists())
			file2.createNewFile();
		if(!file3.exists())
			file3.createNewFile();
		
		Scanner sc=new Scanner(file);
		Scanner sc1=new Scanner(file2);
		FileWriter fw=new FileWriter(file3);
		BufferedWriter br=new BufferedWriter(fw);
		while(sc.hasNextLine()) {
			br.write(sc.nextLine());
			br.write("\n");
		}
		
		while(sc1.hasNextLine()) {
			br.write(sc1.nextLine());
		}
		fw.flush();
		br.flush();
		sc.close();
		sc1.close();
		

	}

}
