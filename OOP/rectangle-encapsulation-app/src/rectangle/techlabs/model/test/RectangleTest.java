package rectangle.techlabs.model.test;

import rectangle.techlabs.model.*;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle small = new Rectangle();
		
		System.out.println(small.readHeight());
		System.out.println(small.readWidth());		
		
		small.changeHeight(10000);
		small.changeWidth(90000);
		
		System.out.println(small.readHeight());
		System.out.println(small.readWidth());
		
		small.changeHeight(-1999);
		small.changeWidth(0);
		
		System.out.println(small.readHeight());
		System.out.println(small.readWidth());
		
		small.changeHeight(100);
		small.changeWidth(90);
		
		System.out.println(small.readHeight());
		System.out.println(small.readWidth());


				



		
	}


}
