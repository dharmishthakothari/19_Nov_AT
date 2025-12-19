package pkgFirst;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]= {1,21,30,234,600};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
			sum=sum+numbers[i];
		}
		System.out.println("Addition of numbers "+sum);
		
	}

}
