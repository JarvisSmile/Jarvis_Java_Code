package com.hugeyurt.object;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(0,0);
		Point p2=new Point(3,4);
		//System.out.print(p1.distance(p2));
		Point p3=new Point();
		Point p4=new Point();
		p3.setAngleAndPolar(180, 10);
		p4.setAngleAndPolar(180, 10);
		Circle C1=new Circle(p1,1);
		Circle C2=new Circle(p2,4);
		int p=C1.Relationship(C2);
		System.out.print(p);
		
	}

}
