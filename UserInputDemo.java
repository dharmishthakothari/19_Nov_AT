package pkgFirst;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,address;
		int id;
		float percentage;
		String grade;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("ENter name");
		name=scan.next();
		
		System.out.println("Enter ID ");
		id=scan.nextInt();
		
		System.out.println("Enter Percetange ");
		percentage=scan.nextFloat();
		
		System.out.println("Enter Grade ");
		grade=scan.next();

		System.out.println(id+"\t"+name+"\t"+percentage+"\t"+grade);
	}

}
