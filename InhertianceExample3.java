package pkgFirst;

class Shape
{
	int getArea()
	{
		return 0;
	}
}
class Rectangle extends Shape
{
	int l,b;
	public Rectangle(int l1,int b1)
	{
		l=l1;
		b=b1;
	}
	
	int getArea()
	{
		return l*b;
	}
}


public class InhertianceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(2, 4);
		System.out.println(r.getArea());
		Shape s=new Shape();
		System.out.println(s.getArea());
		
		
		
	}

}
