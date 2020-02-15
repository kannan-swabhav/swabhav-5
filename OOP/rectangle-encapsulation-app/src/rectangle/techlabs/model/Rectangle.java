package rectangle.techlabs.model;

public class Rectangle {
	private int width;
	private int height;

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

}
