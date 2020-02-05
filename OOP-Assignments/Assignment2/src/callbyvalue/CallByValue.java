package callbyvalue;

public class CallByValue {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println("Before modifying  (Inside main body), a = " + a + " b = " + b);
		b = modify(a, b); //only the value of a,b is passed not the reference to them , b's value will be changed as the value returned by fn will replace the existing value
		System.out.println("After modifying a (Inside main body), a = " + a + " b= " + b);
	}

	public static int modify(int a, int b) 
	{
		System.out.println("Before modifying a (Inside modify Function), a = " + a + " b =" + b);
		a = a + b;

		System.out.println("After modifying a  (Inside modify Function), a =" + a + " b = " + b);
		return a;

	}
}
