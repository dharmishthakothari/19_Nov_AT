package pkgSecond;

import java.io.FileInputStream;
import java.util.Scanner;

public class ExceptionExample1 {
	public static void main(String[] args) {
		int ans = 12 / 2;
		System.out.println(ans);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int no = scan.nextInt();
		System.out.println(no);
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Downlos\\Manual_Testing.docx");
			System.out.println("end of try");
			
		}catch(Exception e)
		{
			System.out.println("in catch");
		}
		
		
	}
}
