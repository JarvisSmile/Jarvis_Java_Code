package com.pan.base;

public class Student {
	//学号、班号、姓名、性别年龄，且都是private类型；
	private String StuID;
	private String ClassID;
	private String Name;
	private String Gender;
	private int Age;
	private static int Count;
	public Student(String StuID,String ClassID,String Name,String Gender,int Age)
	{
		this.StuID=StuID;
		this.ClassID=ClassID;
		this.Name=Name;
		this.Gender=Gender;
		this.Age=Age;
		this.Count++;
	}
	@Override
	public String toString() {
		return "学号：" + StuID + "\t班号：" + ClassID + "\t姓名：" + Name + "\t性别：" + Gender + "\t年龄："
				+ Age ;
	}
	public String getStuID() {
		return StuID;
	}
	public void setStuID(String stuID) {
		StuID = stuID;
	}
	public String getClassID() {
		return ClassID;
	}
	public void setClassID(String classID) {
		ClassID = classID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public static int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public static void main(String args[]) {
		Student s1 = new Student("001", "9801", "张三", "男", 24);
		System.out.println("构造s1 后, 班级人数为: " + Student.getCount());
		Student s2 = new Student("002", "9801", "李四", "女", 21);
		System.out.println("构造s2 后, 班级人数为: " + Student.getCount());
		s1.setName("王平");
		s2.setAge(19);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		if (s1.getAge() > s2.getAge())
			System.out.println("年龄较大人的名字为：" + s1.getName());
		else
			System.out.println("年龄较大人的名字为：" + s2.getName());
	}
}
