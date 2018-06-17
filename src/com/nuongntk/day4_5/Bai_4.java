/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		/*
		 * 4. Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím (Ví dụ
		 * : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int m = 0, S = 0, P = 1, tam;
		do {
			System.out.print("m = ");
			m = Integer.parseInt(input.nextLine());
		} while (m <= 0);
		while (m > 0) {
			tam = m % 10;
			m = m / 10;
			S += tam;
			P *= tam;
		}
		System.out.println("S = " + S);
		System.out.println("P = " + P);
	}

}
