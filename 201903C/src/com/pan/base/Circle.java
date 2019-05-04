package com.pan.base;

public class Circle {
	private double radius;
	void Circle(double radius)
	{
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
}
