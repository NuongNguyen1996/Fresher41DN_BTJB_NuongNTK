/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_9 {
	/**
	 * get max value between a and b
	 * 
	 * @param n
	 * @param a
	 * @return max
	 */

	public static int findMax(int n, int a[]) {
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	/**
	 * main run program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		final int MAX = 100;
		int[][] a = new int[MAX][MAX];
		int m, n;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("m = ");
			m = Integer.parseInt(input.nextLine());
		} while (m <= 0);
		
		do {
			System.out.print("n = ");
			n = Integer.parseInt(input.nextLine());
		} while (n <= 0);
		// a
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("a[" + i + "][" + j + "] =");
				a[i][j] = Integer.parseInt(input.nextLine());
			}
		}
		// b
		int k = 0, p = 1, count = 0;
		for (int i = 0; i < n; i++) {
			if (a[k][i] % 3 == 0) {
				count ++;
				p *= a[k][i];
			}
		}
		if (count > 0) {
			System.out.println("tich la " + p);
		}else {
			System.out.println("Khong the nhan");
		}
		// c
		int[] x = new int[m];
		int[] b = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[j] = a[i][j];
			}
			x[i] = findMax(n, b);
		}
		for (int i = 0; i < m; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
