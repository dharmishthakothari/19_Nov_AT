package pkgFirst;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of element ");
		int no=scan.nextInt();
		int array[]=new int[no];
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter element ");
			array[i]=scan.nextInt();
		}
		for(int i=0;i<no;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
