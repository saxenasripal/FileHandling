package com.sk.filesHandling;

import java.io.File;
import java.io.IOException;

public class FilesHand {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\sripal\\T++A51\\read\\Sample.txt");
		//f.mkdirs();
	if(!f.exists()) {
		System.out.println(f.createNewFile());
}
//		System.out.println();
//		System.out.println(f.canRead());
//		System.out.println(f.setWritable(true));
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getCanonicalPath());
//		System.out.println(f.getName());
//		System.out.println(f.getParent());
//		System.out.println(f.getPath());
//		System.out.println(Long.toString(f.getFreeSpace()));
////		System.out.println(f.isFile());
//		System.out.println(new Date(f.lastModified()));
//		System.out.println(f.length());
//		System.out.println(f.renameTo("xyd"));
//		System.out.println(f.setReadOnly());
//		System.out.println(f.setWritable(true));
//		System.out.println(f.hashCode());
//		System.out.println(f.toURI());
//		f.deleteOnExit();
//		System.out.println(f.exists());
		
	}

	}
