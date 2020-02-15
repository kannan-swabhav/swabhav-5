package boxing;

public class UnBoxingTest {
	public static void main (String args[]) {
		Integer wrapper = new Integer("987");
		int primitive = wrapper.intValue();// converting object to primitive data type is unboxing
		System.out.println(primitive);
	
	}

}
