package stringisimmutable;

public class StringIsImmutableTest {

	public static void main(String[] args) {
		String notimmutable = "immutable";
		String immutable = "immutable";

		notimmutable = notimmutable.concat(" not");
		immutable.concat("not");
		System.out.println("This string contains :" +notimmutable);
		System.out.println("This string contains :" +immutable);

	}


}
