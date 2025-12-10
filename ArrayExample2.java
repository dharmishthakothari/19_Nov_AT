package pkgFirst;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//20 array elements values 1000
		int[] numbers=new int[20];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=1000+i;
		}
		
		//print
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		
	}

}
