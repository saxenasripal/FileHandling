package com.sk.filesHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class readfiles {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi=new File("D:\\sripal\\T++A51\\read\\Sample.txt");
		if(!fi.exists())
			fi.createNewFile();
		
		/*
		 * using FileInputSteam;
		 */
		
//		 FileInputStream fs=new FileInputStream(fi);
//		 int asciicode;
//		 String text="";
//		 while((asciicode=fs.read())!=-1) {
//			 text +=String.valueOf((char)asciicode);
//			 //System.out.print((char)asciicode);
//			 
//		 }
//		 System.out.println(text);
//		 fs.close();
		
		/*
		 * using Scanner
		 */
//		Scanner sc=new Scanner(new FileInputStream(fi));
//		String text="";
//		while(sc.hasNext()) {
//			text += sc.next() + "\n";
//			
//		}
//		System.out.println(text);
//		
//		sc.close();
		
		/*
		 *  using FileReader
		 */
//	FileInputStream fis=new FileInputStream(fi);
//		FileReader fe=new FileReader(fi);
//		int asciicode=fe.read();
//		while(asciicode!=-1) {
//			System.out.print((char)asciicode);
//			asciicode=fe.read();			
//			
//		}
//		fe.close();
//		
		/*
		 * using BufferReader
		 */
//		FileReader fr= new FileReader(fi);
//		BufferedReader br = new BufferedReader(fr);
//		String x="";
//		String text="";
//		while((x=br.readLine()) !=  null ) {
//			text +=x + '\n';
//			//System.out.println(x);
//			
//		}
//		System.out.println(text);
//		fr.close();
//		
//		br.close();
		
		
				

	}

}
