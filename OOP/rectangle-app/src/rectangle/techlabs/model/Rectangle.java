package rectangle.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	
	public int changeWidth( int pwidth) {
		if(pwidth<0) {
			pwidth = 1;
			if(pwidth > 100) {
				pwidth =100;
			}
		}
		
		return pwidth;
	}
	public int changeHeight( int pheight) {
		if(pheight<0) {
			pheight= 1;
			if(pheight > 100) {
				pheight =100;
			}
		}
		
		return pheight;
	}

}
