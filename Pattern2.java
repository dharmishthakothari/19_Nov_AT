package pkgFirst;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows ");
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}

}
