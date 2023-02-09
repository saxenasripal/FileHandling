package com.sk.filesHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment4 {
	
		public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Assignment4 obj=new Assignment4();
		File file=new File("D:\\sripal\\T++A51\\Java_programming\\OOPs\\JavaPractice\\src\\com\\sk\\filesHandling\\sample.text");
		System.out.println("enter the string");
		String a=sc.next();
		System.out.println(a);
		Scanner Re=new Scanner(file);
		int count=0;
		while(Re.hasNext()) {
			if(a.equals(Re.next())) {
				count++;
			}
				
		}
		System.out.println(count++);
		Re.close();
		sc.close();

	}
		

}



