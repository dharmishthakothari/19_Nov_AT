package pkgFirst;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[2][3];
		arr[0][0] = 45;
		arr[0][1] = 66;
		arr[0][2] = 77;

		arr[1][0] = 409;
		arr[1][1] = 3232;
		arr[1][2] = 44;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}

}
