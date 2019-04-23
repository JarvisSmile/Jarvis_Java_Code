package com.hugeyurt.homework;

public class H05_02_rectangle {
	private double Length;
	private double Width;
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		Width = width;
	}
	public double Area()
	{
		return this.Length*this.Width;
	}
	
}
