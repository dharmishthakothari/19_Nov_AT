package pkgSecond;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileWriteByte {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos=new FileOutputStream("..\\MyFirstJavaProject_MWF_12_1\\src\\pkgSecond\\name.txt",true);
		String str="ravi ramesh rohit";
		byte[] buffer=str.getBytes();
		fos.write(buffer);
		System.out.println("Data is written");
		
		
	}

}
