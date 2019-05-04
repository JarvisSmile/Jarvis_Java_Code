package com.pan.base;

public class Cylinder extends Circle{
	private int height;
	public Cylinder(double radius,int height)
	{
		this.height=height;
		this.setRadius(radius);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea()
	{
		double p=Math.PI;
		return 2*p*this.getRadius()*this.height+2*p*this.getRadius()*this.getRadius();
	}
	public double getVolume()
	{
		return Math.PI*this.getRadius()*this.getRadius()*this.height;
	}
}