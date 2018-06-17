/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_6 {
	/**
	 * get nhiPhan number
	 * @param n
	 * @return nhiPhan(n)
	 */
	public static StringBuffer nhiPhan(int n) {
		StringBuffer strB = new StringBuffer();
		int du;
		while (n > 0) {
			du = n % 2;
			n /= 2;
			strB = strB.append(String.valueOf(du)) ;
		}
		return strB;
	}

	public static void main(String[] args) {
		/*
		 * 6. Viết chương nhập vào một số nguyên dương n.
		 *  Sau đó quy đổi n ra hệ nhị phân.
		 */
		Scanner input = new Scanner(System.in);
		int n = 0, S = 0, P = 1, tam;
		do {
			System.out.print("m = ");
			n = Integer.parseInt(input.nextLine());
		} while (n <= 0);
		System.out.println("Nhi phan: " + nhiPhan(n).reverse());
	}
}
