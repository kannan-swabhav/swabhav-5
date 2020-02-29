package rectangle.techlabs.model;

public class Rectangle {
	private int width = 5;
	private int height = 10 ;

	public void changeWidth(int pwidth) {
		if (pwidth < 0) {
			pwidth = 1;
		}
		if (pwidth > 100) {
			pwidth = 100;
		}

		width = pwidth;

	}

	public void changeHeight(int pheight) {
		if (pheight < 0) {
			pheight = 1;
		}
		if (pheight > 100) {
			pheight = 100;
		}

		height = pheight;
		
	}

	public int readWidth() {
		return width;
	}

	public int readHeight() {
		return height;
	}
	
	public int calculateArea() {
		return (width*height);
	}

}
