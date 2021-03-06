package com.hugeyurt.object;

public class Point 
{
	private double x;
	private double y;
	private double angle;
	private double Polar;
	
	
	public Point()  // public Point(Point this)
	{
		this.x=0;
		this.y=0;
	}
	public void setAngleAndPolar(double Angle,double Polar)
	{
		this.x=Polar*Math.cos(Angle);
		this.y=Polar*Math.sin(Angle);

		System.out.println(this.x+"&"+this.y);
		this.angle=Angle;
		this.Polar=Polar;
	}
	public Point(double x,double y)  // public Point(double x,double y,Point this)
	{
		this.x=x;
		this.y=y;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}	
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	public void printX() //public void printX(Point this)
	{
		System.out.println(this.x);
	}
	
	public double distance(Point P1 )
	{
		double R;
		double X=Math.abs(P1.getX()-this.getX());
		double Y=Math.abs(P1.getY()-this.getY());
		R=Math.sqrt(X*X+Y*Y);
		return R;
	}
	
}
