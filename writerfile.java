package com.sk.filesHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class writerfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi=new File("D:\\sripal\\T++A51\\read\\Sample.txt");
		if(fi.exists()) {
			System.out.println(fi.delete());
			System.out.println(fi.createNewFile());	
			
		}
//		FileOutputStream fs=new FileOutputStream(fi);
//		String a="hello";
//		for(int i=0;i<a.length();i++) {
//			fs.write((int)a.charAt(i));
//			
//		}
//		
//		fs.flush();
		

	}

	
}
