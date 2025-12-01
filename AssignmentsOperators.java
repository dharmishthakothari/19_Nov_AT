package pkgFirst;

import java.util.Scanner;

public class AssignmentsOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number ");
		int num=scan.nextInt();
		System.out.println(num+=10);
		System.out.println(num-=10);
		System.out.println(num*=10);
		System.out.println(num/=10);
		
		num=200;
		int i=num++; // num+=1
		System.out.println("i= "+i+" num = "+num);
		
		num=200;
		int j=++num; // num+=1
		System.out.println("j= "+j+" num = "+num);
		
		
	}

}
