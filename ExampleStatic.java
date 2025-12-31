package pkgSecond;

class Example1
{
	static int i=0;
	int j=0;
	public Example1() {
		i++;
		j++;
	}
	
	void display()
	{
		System.out.println("Static "+i);
		System.out.println("Non static "+j);
	}
	static void greet()
	{
		System.out.println("Good morning ");
	}
	void greet1()
	{
		System.out.println("Hello");
	}
}

public class ExampleStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example1.greet();
//		Example1 obj=new Example1();
		Example1 obj=new Example1();
		obj.display();
		
		Example1 obj1=new Example1();
		obj1.display();
		
		Example1 obj2=new Example1();
		obj2.display();
	}

}
