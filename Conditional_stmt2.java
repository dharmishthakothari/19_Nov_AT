package pkgFirst;

import java.util.Scanner;

public class Conditional_stmt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=scan.nextInt();
		if(age>18)
		{
			System.out.println("Use is Adult ");
		}else
		{
			System.out.println("User is not Adult ");
		}
	}

}
