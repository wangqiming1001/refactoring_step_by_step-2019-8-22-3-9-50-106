package com.tws.refactoring;

public class Driver {
 //   public int age;

//    public Driver(int age) {
//        this.age = age;
//    }
    private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Driver(int age) {
        this.age = age;
    }
}
