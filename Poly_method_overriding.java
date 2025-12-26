package pkgFirst;

class ShapeNew
{
	int getArea()
	{
		return 0;
	}
}
class RectangleNew extends ShapeNew
{
	int l,b;
	void getData(int l1,int b1)
	{
		l=l1;
		b=b1;
	}
	
	int getArea() {
		return l*b;
	}
	
}

 class sqaure extends ShapeNew
 {
	 int side;
	 void getdata(int s1)
	 {
		 side=s1;
	 }
	 int getArea()
	 {
		 return side*side;
	 }
	 
 }

public class Poly_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleNew obj=new RectangleNew();
		obj.getData(2, 6);
		System.out.println("Area of Rectangle is "+obj.getArea());
		sqaure obj1=new sqaure();
		obj1.getdata(20);
		System.out.println("Area of Square is "+ obj1.getArea());
	}

}

 
 