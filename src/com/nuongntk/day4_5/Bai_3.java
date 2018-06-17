/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_3 {

	public static int gt(int n) {
		int gt = 1, i = 1;
		if (n == 0) return 1;
		else {
			while (i <= n) {
				gt *= i;
				i++;
			}
			return gt;
		}
	}

	public static void main(String[] args) {
		/*
		 * 3. Viết chương trình tính : S = 1+1/3!+1/5!+…..+1/(2n-1)! Số n được nhập từ
		 * bàn phím
		 */
		Scanner input = new Scanner(System.in);
		int n = 0;
		float S = 0;
		do {
			System.out.print("N = ");
			n = Integer.parseInt(input.nextLine());
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			S += 1/(float)gt(2*i-1);
		}
		System.out.println("S = " + String.format("%.2f", S));
	}

}
