package pkgSecond;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\Example1.c");
		File f=new File("NewNotes.txt");
		System.out.println("Before "+f.canExecute()+"\t"+f.exists()+"\t"+f.getParent());
		System.out.println(f.getPath());
		FileOutputStream fos=new FileOutputStream(f);
		System.out.println("After "+f.canExecute()+"\t"+f.exists()+"\t"+f.getParent());
		System.out.println(f.getPath()+"\t"+f.getAbsolutePath());
		int data;
		do
		{
			data=fis.read();
			fos.write(data);
			System.out.print((char)data);
		}while(data!=-1);
	}

}
