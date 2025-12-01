package pkgFirst;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1,number2;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter number 1 ");
		number1=scan.nextInt();
		
		System.out.println("Pleaes enter number 2 ");
		number2=scan.nextInt();
		System.out.println(number1+">"+number2+" is "+(number1>number2));
		System.out.println(number1+"<"+number2+" is "+(number1<number2));
		System.out.println(number1+"!="+number2+" is "+(number1!=number2));
		
		//45>23 is true
		//45<23 is false
		System.out.println(number1>number2 && number1>100);
		System.out.println(number1>number2 || number1>100);
		
		
	}

}
