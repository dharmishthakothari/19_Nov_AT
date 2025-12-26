package pkgFirst;

public class Poly_method_overloading {

	public void display(String name)
	{
		System.out.println(name);
	}
	public void display(String msg,String name)
	{
		System.out.println(msg+name);
	}
	public void display(String msg,String name,int age)
	{
		System.out.println(msg+name+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_method_overloading obj=new Poly_method_overloading();
		obj.display("Sajid");
		obj.display("Good Morning","Dharmishtha");
		
	}

}
