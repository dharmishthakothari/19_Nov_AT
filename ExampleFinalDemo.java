package pkgSecond;

class First
{
	final int val=20;
	void greet()
	{
		System.out.println("Hello");
		val=200;
	}
}
class Second extends First 
{
	void greet()
	{
		System.out.println("Good afternoon");
	}
}


public class ExampleFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
