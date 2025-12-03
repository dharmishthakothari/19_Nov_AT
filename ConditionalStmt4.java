package pkgFirst;

import java.util.Scanner;

public class ConditionalStmt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=scan.nextInt();
		
		System.out.println("Enter Weight");
		int weight=scan.nextInt();
		
		if(age>18 )
		{
			if(weight>55)
			{
				System.out.println("Eligible for Military admission");
			}else
			{
				System.out.println("Due to underweight user is not able to take admission in military");
			}
			
		}else
		{
			System.out.println("Not eligible due to age ");
		}
	}

}
