/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 1.0
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_1 {
	/*
	 * 1. Viết chương trình in ra các dấu * theo cấu trúc như sau (cho n là chiều
	 * cao của tháp tam giác, cần in ra n dòng): Ví dụ : n = 6
	 *
	 **
	 ***
	 ****
	 *****
	 *******/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("N = ");
			n = Integer.parseInt(input.nextLine());
		} while (n <= 0);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
