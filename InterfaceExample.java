package pkgSecond;

public class InterfaceExample implements MathInterface,StringInterface {
	@Override
	public int addition(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1+no2;
	}
	@Override
	public int subtraction(int no1, int no2) {
		// TODO Auto-generated method stub
		return no1-no2;
	}
	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Good monring "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceExample obj=new InterfaceExample();
		System.out.println(obj.addition(23,45));
		System.out.println(obj.subtraction(234, 213));
		System.out.println(obj.greet("dharmishtha"));
	}

}
