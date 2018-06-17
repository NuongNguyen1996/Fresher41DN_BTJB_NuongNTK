/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 15, 2018
@version: 
*/
package com.nuongntk.qluv;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.SWAP;
class Balloon{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Balloon(String color) {
		super();
		this.color = color;
	}
	
	public Balloon() {
		super();
	}
	
	
	public static void foo(Balloon ballon) {
		ballon.setColor("red");
		ballon = new Balloon();
		ballon.setColor("blue");
	}
	
	public  static void swap(Balloon red, Balloon blue) {
		red = blue;
		Balloon tam = new Balloon();
		tam = red;
		blue = tam;
	}
}
class A{
	void ShowInfo() {
		System.out.println("a");
	}
}
class B extends A{
	void ShowInfo() {
		System.out.println("B");
	}
	public void ShowInfoB() {
		System.out.println(" new B");
	}
}
public class Demo {
	
	
public static void main(String[] args) {
	Balloon red = new Balloon("red");
	Balloon blue = new Balloon("blue");
	
	Balloon.swap(red, blue);
	System.out.println("red color is: " + red.getColor());
	System.out.println("blue color is: " + blue.getColor());
	Balloon.foo(blue);
	System.out.println("blue color is: " + blue.getColor());
	A a= new B();// a được ép kiểu sang A
	System.out.println(a instanceof B);
	System.out.println(a instanceof A);
	//( a).ShowInfoB();// 
}
//	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//	Date date = new Date();
//	System.out.println(df.format(date));
//	
//	LocalDate ld = LocalDate.now();
//	System.out.println(ld.getYear());
//	
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//	System.out.println(ld.format(dtf));
//	
//	String strDate = "2012-12-12";
//	// convert from string to localdate
//	System.out.println(LocalDate.parse(strDate, dtf) );
//	LocalDate ld1 = LocalDate.now();
//	LocalDate ld2 = LocalDate.now();
//Period pr = Period.between(ld1,ld2 );
//System.out.println(pr);
	
//	for (int i = 0; i < 2; i++) {
//		for (int j = 0; j <3; j++) {
//			if (i==j) {
//				continue;
//			}
//			System.out.println("i "+ i+ "; j "+ j);
//		}
//		
//	}




	
	
	
	
	
	
	


}
