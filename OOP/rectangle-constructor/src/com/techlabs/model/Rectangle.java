package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private Colors color;

	public Rectangle(int pwidth, int pheight, Colors pcolor) {
		color = pcolor;
		height =checkHeight(pheight);
		width =checkWidth(pwidth);

	}

	public Rectangle(int pwidth, int pheight) {

		color = Colors.red;
		height = checkHeight(pheight);
		width =checkWidth(pwidth);
	}

	public int calculateArea() {
		return (height * width);
	}

	/*private String checkColor(String pcolor) {
		pcolor = checkNullChar(pcolor);
		if (pcolor.equals("red") || pcolor.equals("blue") || pcolor.equals("green"))
			return color = pcolor;

		return color = "red";

	}*/

	private String checkNullChar(String pcolor) {
		if (pcolor != null) {

			return pcolor.toLowerCase();
		}
		return pcolor = "red";

	}

	public int checkHeight(int pheight) {
		height = pheight;
		if (pheight <= 0) {
			return 1;
		}
		return pheight;
	}

	public int checkWidth(int pwidth) {
		width = pwidth;
		if (pwidth <= 0) {
			return 1;
		}
		return pwidth;

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;

	}

	public Colors getColor() {
		return color;

	}
}
