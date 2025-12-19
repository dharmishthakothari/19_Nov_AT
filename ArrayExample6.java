package pkgFirst;

public class ArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][]= {{1,2,6},{89,67,34,546456,56765},{56,55,90}};
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print("\t"+array[i][j]);
				sum+=array[i][j];
			}
			System.out.println();
		}
		
		
	}

}
