package com.sk.filesHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fi=new File("D:\\sripal\\T++A51\\Java_programming\\OOPs\\JavaPractice\\src\\com\\sk\\filesHandling\\sample.text");
		
		Scanner sc=new Scanner(fi);
		int count=0;
		while(sc.hasNext())
		{
			
			count++;
			sc.next();
			
		}
		System.out.println("the Total Number of Lines are "+count);
		sc.close();
		

	}

}
