package pkgSecond;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\Example1.c");
		byte[] buffer=new byte[20];
		//fis.read(buffer);
		//#include<stdio.h>
		//i
		fis.read(buffer, 4, 15);
		String str=new String(buffer);
		System.out.println(str);
		
		FileOutputStream fos=new FileOutputStream("test.txt",true);
		fos.write(65);
		fos.write(45);
		fos.write(90);
		fos.write(102);
		String str1="Today is tuesday";
		byte[] buf=str1.getBytes();
		fos.write(buf, 5, 10);

		
	}

}
