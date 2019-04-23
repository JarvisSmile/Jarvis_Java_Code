package com.hugeyurt.homework;

public class H05_02_cubiod extends H05_02_rectangle{
	private double Hight;
	public double getHight() {
		return Hight;
	}
	public void setHight(double hight) {
		Hight = hight;
	}
	H05_02_cubiod(double Length,double Width,double Hight)
	{
		this.setLength(Length);
		this.setWidth(Width);
		this.Hight=Hight;
	}
	public double volum()
	{
		return this.Area()*this.Hight;	
	}
	@Override
	public String toString() {
		return " [Hight=" + this.Hight + ", Length=" + this.getLength() + ", Width=" + this.getWidth() +", Bottom Area="+this.Area()+", Volum="+this.volum() +"]";
	}
	
}
