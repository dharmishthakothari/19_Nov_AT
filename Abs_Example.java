package pkgFirst;

 abstract class ShapeClass
{
	abstract int getArea();
	
}
class RectangelClass extends ShapeClass
{
	int l,b;
	RectangelClass(int l1,int b1)
	{
		l=l1;
		b=b1;
	}
	@Override
	int getArea() {
		// TODO Auto-generated method stub
	return l*b;
	}
}

public class Abs_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangelClass obj=new RectangelClass(2, 5);
		System.out.println(obj.getArea());
	}

}
