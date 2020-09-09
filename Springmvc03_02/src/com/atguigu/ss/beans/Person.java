package com.atguigu.ss.beans;

public class Person {

	private String name ;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("My name is:"+name);
	}
}
