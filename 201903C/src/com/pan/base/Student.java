package com.pan.base;

public class Student {
	//ѧ�š���š��������Ա����䣬�Ҷ���private���ͣ�
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
		return "ѧ�ţ�" + StuID + "\t��ţ�" + ClassID + "\t������" + Name + "\t�Ա�" + Gender + "\t���䣺"
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
		Student s1 = new Student("001", "9801", "����", "��", 24);
		System.out.println("����s1 ��, �༶����Ϊ: " + Student.getCount());
		Student s2 = new Student("002", "9801", "����", "Ů", 21);
		System.out.println("����s2 ��, �༶����Ϊ: " + Student.getCount());
		s1.setName("��ƽ");
		s2.setAge(19);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		if (s1.getAge() > s2.getAge())
			System.out.println("����ϴ��˵�����Ϊ��" + s1.getName());
		else
			System.out.println("����ϴ��˵�����Ϊ��" + s2.getName());
	}
}
