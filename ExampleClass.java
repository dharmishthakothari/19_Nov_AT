package pkgFirst;

import java.util.Scanner;

class Employee
{
	int id,salary;
	String name;
	void getDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name ");
		name=scan.next();
		
		System.out.println("Enter id ");
		 id=scan.nextInt();
		
		System.out.println("Enter Salary ");
		 salary=scan.nextInt();
	}
	void display()
	{
		System.out.println(name+"\t"+id+"\t"+salary);
	}
	
}
public class ExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
		emp1.display();
		emp2.display();
		emp3.display();
		
	}

}
