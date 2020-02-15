package objectcalisthenics;

public class ObjectCalisthenicsRule1Test {
	public static void main(String args[]) {
		System.out.println("Withou Rule 1 :");
		withoutRule1(5);
		System.out.println("With Rule 1 :");
		withRule1(5);

	}

	public static void withoutRule1(int n) {
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public static void withRule1(int n) {
		int i;
		for (i = 0; i <= n; i++) {
			toPrintRows(i);

		}

	}
	public static void toPrintRows(int i) {
		int j;
		for (j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}

}
