package pkgFirst;

import java.util.Scanner;

class Person {
	int c_no;
	String name;

	void getDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name ");
		name = scan.next();

		System.out.println("Enter c_no");
		c_no = scan.nextInt();
	}

	void display() {
		System.out.println(name + "\t" + c_no);
	}

}

public class OOPSExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object of Person class
		Person p=new Person();
		Person p1=new Person();
		p.getDetails();
		p1.getDetails();
		
		p.display();
		p1.display();
		
		
		
		
		
		
		
		
		
		
		
	}

}
