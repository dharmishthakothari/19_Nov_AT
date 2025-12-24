package pkgFirst;
class Test
{
	int addition(int n1,int n2)
	{
		return n1+n2;
	}
	float addition(int n1,float n2,int n3)
	{
		return n1+n2+n3;
	}
}
public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new  Test();
		System.out.println(obj.addition(23,324,4354));
		System.out.println(obj.addition(23,2));
		obj.addition(23,3434);
	}

}
