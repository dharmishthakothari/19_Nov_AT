package pkgSecond;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadByte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\22nd_10_11.txt");

		// To read whole file
//		int data=0;
//		while(data!=-1)
//		{
//			data=fis.read();
//			System.out.print((char)data);
//		}
		byte[] buffer = new byte[200];
		fis.read(buffer);
		String str = new String(buffer);
		System.out.println(str);

	}

}
