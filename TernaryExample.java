package pkgFirst;

import java.util.Scanner;

public class TernaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter number 1 ");
		number1=scan.nextInt();
		
		System.out.println("Pleaes enter number 2 ");
		number2=scan.nextInt();
		
		int ans=(number1>number2)?number1:number2;
		System.out.println(ans);
		
		
		
	}

}
