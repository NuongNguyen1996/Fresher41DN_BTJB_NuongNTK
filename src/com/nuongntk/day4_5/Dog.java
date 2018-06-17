/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 13, 2018
@version: 
*/
package com.nuongntk.day4_5;

public class Dog {
private String	name;

public Dog(String name) {
	super();
	this.name = name;
}
public  void setName(String name) {
	this.name = name;
}

public  String getName() {
	return this.name;
}

public void foo(Dog aDog) {
	System.out.println(aDog.getClass());
	aDog = new Dog("bibi");
	System.out.println(aDog.getName());
}

public static void swapName(Dog a, Dog b) {
	/*a.setName(b.getName());
	b.setName(a.getName());*/
	a = b;
	b = new Dog("Nuong");
	System.out.println(a.getName() + " / "+ b.getName());
}

public static void main(String[] args) {
	Dog a = new Dog("AA");
	Dog b = new Dog("BB");
	System.out.println(a.getName() + " / "+ b.getName());
	swapName(a, b);
	System.out.println(a.getName() + " / "+ b.getName());
	
}
}
