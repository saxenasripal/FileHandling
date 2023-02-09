package com.sk.filesHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * this program is to find the number of lines in the file.
 */

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fe=new File("D:\\sripal\\T++A51\\Java_programming\\OOPs\\JavaPractice\\src\\com\\sk\\filesHandling\\sample.text");
		if(!fe.exists())
		System.out.println(fe.createNewFile());
		int count=0;
		
		FileReader fr=new FileReader(fe);
		BufferedReader br=new BufferedReader(fr);
		String x="";
		while((x=br.readLine()) != null)
		{
			count++;
		}
		System.out.println("the total number of lines in the file are "+count);
		br.close();

	}

}
