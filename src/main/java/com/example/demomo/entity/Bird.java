package com.example.demomo.entity;

//1.entity_實體 屬性私人權限
public class Bird {
	private String name = "Kavin";
	private int age = 7;
	//數值這邊設不設不影響
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
