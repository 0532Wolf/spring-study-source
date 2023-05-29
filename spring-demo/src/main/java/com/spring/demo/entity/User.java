package com.spring.demo.entity;

public class User {
	private String name;


	public void sayHello(){
		System.out.println("hello "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
