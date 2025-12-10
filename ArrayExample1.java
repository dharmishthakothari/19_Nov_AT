package pkgFirst;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare array having 10 numbers
		int[] numbers = new int[25];

		numbers[5] = 890;
		numbers[2] = 560;
		numbers[8] = 456456;

		for (int i = 0; i < numbers.length; i++) {
			// print all elements of an array
			System.out.println(numbers[i]);
		}

	}

}
