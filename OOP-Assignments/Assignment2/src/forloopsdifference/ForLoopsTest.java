package forloopsdifference;

public class ForLoopsTest {
	public static void main(String[] args) {
		int Array[] = { 20, 50, 30 }, i;
		final int CONST = 3;

	// To iterate over array
		
		// Traditiona for loop
		System.out.print("Array elemnts using traditonal for loop are : ");
		for (i = 0; i <= 2; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();
		// Enhanced For loop
		System.out.print("Array elemnts using enhanced for loop are : ");
		for (int a : Array) // No need to keep track of number of elements in array
		{
			System.out.print(a + " ");
		}
		System.out.println();

	// To print reverse of array

		// In Traditional for loop can be done
		System.out.print("Array elemnts using traditonal for loop are : ");
		for (i = 2; i >= 0; i--) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();

		/*
		 * In enhanced for loop not possible because array elements are printed only in
		 * incremental order
		 */
		// To access alternate elements
		// Traditonal for loop
		System.out.print("Array elemnts using traditonal for loop are : ");
		for (i = 0; i <= 2; i = i + 2) {
			System.out.print(Array[i] + " ");
		}
		// Not possible in Enchanced forr loop as array elements are printed in
		// sequential order
	}
}
