package com.sk.filesHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment3 {
	public int wordcount(String s) {
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;				
			}
		}
		return count;
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Assignment3 obj=new Assignment3();
		File fe=new File("D:\\sripal\\T++A51\\Java_programming\\OOPs\\JavaPractice\\src\\com\\sk\\filesHandling\\sample.text");
		Scanner sc=new Scanner(fe);
		int max=0;
		String s="",line="";
		while(sc.hasNextLine()) {
			s=sc.nextLine();
			int temp=obj.wordcount(s);
			if(temp>0) {
				max=temp;
				line=s;
			}
					
		}
		sc.close();
		System.out.println(max);
		System.out.println(line);
		
		
	}

}
