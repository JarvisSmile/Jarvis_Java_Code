package com.hugeyurt.object;

public class PluralApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plural P1=new Plural(5,6);
		System.out.println(P1.Print());
		Plural P2=new Plural(3,4);
		Plural P3=P1.Add(P2);
		System.out.println(P3.Print());
		Plural P4=P1.Subtraction(P2);
		System.out.println(P4.Print());
		Plural P5=P1.Multiply(P2);
		System.out.println(P5.Print());
		Plural P6=P1.Divide(P2);
		System.out.println(P6.Print());
	}

}
