/** 
 * Program no - 2
 * Purpose : To show operatos
 * Date : 1st Dec
 * Auther
 * 
 * */
package pkgFirst;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//declaration and initlization 
			int number1,number2,ans;
			/* We are demonstrating Arithmatic operators 
			 * of inteeger numbers
			 */
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Please enter number 1 ");
			number1=scan.nextInt();
			
			System.out.println("Pleaes enter number 2 ");
			number2=scan.nextInt();
			
			ans=number1+number2;
			System.out.println("Addition = "+ans);
			ans=number1-number2;
			System.out.println("Subtraction = "+ans);
			
			System.out.println("Multilication ="+(number1*number2));
			
			System.out.println("Division = "+(number1/number2));

			System.out.println("Reminder = "+(number1%number2));

	}

}
