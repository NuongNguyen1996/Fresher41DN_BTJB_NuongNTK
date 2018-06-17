/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 1.0
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_2 {
	/*
	 * 2. Viết chương trình tính : 
	 * S=1+1/2+1/3+....+1/n Số n được nhập từ bàn phím
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		float S = 0;
		do {
			System.out.print("N = ");
			n = Integer.parseInt(input.nextLine());
		} while (n <= 0);
		
		for (int i = 1;i<=n;i++) {
			S += 1/(float)i;
		}
		System.out.println("S = " + String.format("%.2f", S));
	}

}
