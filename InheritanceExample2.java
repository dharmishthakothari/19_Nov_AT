package pkgFirst;

class Person1 {
	int c_no;
	String name;

	Person1(String name1, int c_no1) {
		name = name1;
		c_no = c_no1;
	}

	void display() {
		System.out.println(name + "\t" + c_no);
	}
}

class Employee2 extends Person1 {

	Employee2(String name1, int c_no1) {
		super(name1, c_no1);
		// TODO Auto-generated constructor stub
	}

	

}

public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2("ttttt", 232323);
		e1.display();
	}

}
