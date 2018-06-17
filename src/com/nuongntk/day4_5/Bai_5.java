/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_5 {
	/**
	 * function exec UCLN
	 * @param a
	 * @param b
	 * @return UCLN (a,b)
	 */
	public static int UCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -=b;
			}else {
				b -=a;
			}
		}
		return a;
	}
	/**
	 * function exec BCNN
	 * @param a
	 * @param b
	 * @return BCNN(a,b)
	 */
	public static int BCNN(int a, int b) {
		return ((a*b)/UCLN(a, b));
	}

	public static void main(String[] args) {
		/*
		 * 5. Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất và bội
		 * số chung nhỏ nhất của 2 số nguyên dương a và b đó.
		 */
		Scanner input = new Scanner(System.in);
		int a, b;
		// input
		do {
			System.out.print("a = ");
			a = Integer.parseInt(input.nextLine());
		} while (a <= 0);
		do {
			System.out.print("b = ");
			b = Integer.parseInt(input.nextLine());
		} while (b <= 0);
		// output
		System.out.println("UCLN: " + UCLN(a,b));
		System.out.println("BCNN: " + BCNN(a, b));
		
	}

}
