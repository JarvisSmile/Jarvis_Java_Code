package com.hugeyurt.object;

public class Circle {
	private Point position=new Point();
	private double r;
	
	public Circle(Point P,double r)
	{
		this.position=P;
		this.r=r;
	}
	
	public Circle(double Angle,double Polar)
	{
		position.setAngleAndPolar(Angle, Polar);
		
	}
	
	public Point getPoint() 
	{
		return this.position;
	}
	
	public double Area()
	{
		return Math.PI*this.r*this.r;
	}
	
	public int Relationship(Circle C)
	{
		
		if(this.position.distance(C.position)<this.r+C.r)
			return 1;//�ཻ
		else if(this.position.distance(C.position)==this.r+C.r)
			return 2;//����
		else if(this.position.distance(C.position)==Math.abs(this.r-C.r))
			return 3;//����
		else if(this.position.distance(C.position)==0)
			return 4;//ͬ��
		else
			return 5;//����
	}
}