package pkgFirst;

import java.util.Scanner;

public class SwtichExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,choice,ans;
		System.out.println("1. Addition\r\n"
				+ "2. Substraction\r\n"
				+ "3. Multiplication\r\n"
				+ "4. Division\r\n"
				+ "Enter user choice ");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		System.out.println("Enter Number 1 ");
		int no1=scan.nextInt();
		System.out.println("Enter Number 2 ");
		int no2=scan.nextInt();
		
//		if(choice==1)
//		{
//			ans=no1+no2;
//			System.out.println(ans);
//		}else if(choice==2)
//		{
//			ans=no1-no2;
//			System.out.println(ans);
//			
//		}else if(choice==3)
//		{
//			ans=no1+no2;
//			System.out.println(ans);
//
//		}
		switch(choice)
		{
		case 1:ans=no1+no2;
				System.out.println("Addition "+ans);
				break;
		case 2: ans=no1-no2;
				System.out.println("Substraction "+ans);
				break;
		case 3:ans=no1*no2;
				System.out.println("Multiplication "+ans);
				break;
		case 4:ans=no1/no2;
				System.out.println("Division "+ans);
				break;
		default :System.out.println("Please enter valid choice ");
		}
	}

}
