package boxing;

public class BoxingTest {
	public static void main (String args []) {
		int primitive = 90;
		Integer wrapper = new Integer(primitive);//converting primitive data type to object is boxing
		System.out.println(wrapper);
	}

}
