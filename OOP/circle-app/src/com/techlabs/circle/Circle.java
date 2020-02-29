package com.techlabs.circle;

public class Circle {
	private float radius;
	private final float PI = 3.14f;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float cradius) {
		radius = cradius;
	}

	public float calulateArea(float radius) {
		return (PI * radius * radius);

	}

	public float calculatePerimeter(float radius) {
		return (2 * PI * radius);
	}

} 
