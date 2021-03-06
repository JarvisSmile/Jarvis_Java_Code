package com.hugeyurt.object;

public class Plural {
	private int real;
	private int imaginary;
	public Plural(int Real,int Imageinary) 
	{
		this.real=Real;
		this.imaginary=Imageinary;
	}
	public String Print() 
	{
		String re=this.real+"+"+this.imaginary+"i";
		return re;
	}
	public Plural Add(Plural P)
	{
		return new Plural(this.real+P.getReal(),this.imaginary+P.getImaginary());
	}
	public Plural Subtraction(Plural P)
	{
		return new Plural(this.real-P.getReal(),this.imaginary-P.getImaginary());
	}
	public Plural Multiply(Plural P)
	{
		
		return new Plural((this.real*P.getReal()-this.imaginary*P.getImaginary()),(this.imaginary*P.getReal()+this.real*P.getImaginary()));
	}
	public Plural Divide(Plural P)
	{
		return new Plural((this.real*P.getReal()+this.imaginary*P.getImaginary())/(P.getImaginary()*P.getImaginary()+P.getReal()*P.getReal()),(this.imaginary*P.getReal()-this.real*P.getImaginary())/(P.getImaginary()*P.getImaginary()+P.getReal()*P.getReal()));
	}
	public int getReal() 
	{
		return real;
	}
	public void setReal(int real) 
	{
		this.real = real;
	}
	public int getImaginary() 
	{
		return imaginary;
	}
	public void setImaginary(int imaginary) 
	{
		this.imaginary = imaginary;
	}
}
