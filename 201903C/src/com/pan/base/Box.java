
package com.pan.base;

public class Box {

	private double length;
	private double width;
	private double height;
	public Box(double l,double w,double h)
	{
		this.length=l;
		this.height=h;
		this.width=w;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume()
	{
		return this.length*this.width*this.height;
	}
	@Override
	public String toString() {
		return String.format("边长为%.2f,%.2f,%.2f的长方体", this.height,this.length,this.width);
	}
	
}
