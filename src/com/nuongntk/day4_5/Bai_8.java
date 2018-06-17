/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_8 {
	public static void main(String[] args) {
		/*
		 * 8. Viết chương trình thực hiện các công việc như sau : a. Nhập một mảng a gồm
		 * n phần tử kiểu nguyên int b. Tính tổng số dương lẻ của mảng a c. Nhập vào
		 * phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị
		 * trí của k trong mảng. 
		 * d. Sắp sếp mảng a theo thứ tự tăng dần.
		 * e. Chèn một số
		 * p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần.
		 */

		// input
		final int MAX = 100;
		int[] a = new int[MAX];
		int n = 0;
		Scanner input = new Scanner(System.in);
		char choose;
		do {
			System.out.print("n = ");
			n = Integer.parseInt(input.nextLine());
		} while (n <= 0);
		
		// process
		do {
			System.out.print("Choose : ");
			choose = input.nextLine().charAt(0);
			switch (choose) {
			case 'a': {
				for (int i = 0; i < n; i++) {
					System.out.print("a[" + i + "]= ");
					a[i] = Integer.parseInt(input.nextLine());
				}
				// output
				for (int i = 0; i < n; i++) {
					System.out.print(a[i] + " ");
				}
				break;
			}
			case 'b': {
				int s = 0;
				for (int i = 0; i < n; i++) {
					if (a[i] > 0 && a[i] % 2 != 0) {
						s += a[i];
					}
				}
				System.out.println("tong so duong le: " + s);
			}
				break;
			case 'c': {
				int k, count = 0;
				System.out.print("nhap k ");
				k = Integer.parseInt(input.nextLine());
				for (int i = 0; i < n; i++) {
					if (a[i] == k) {
						count++;
						System.out.print(i + "; ");
					}
				}
				if (count == 0) {
					System.out.println("khong co " + k + "trong mang a");
				}
			}

				break;
			case 'd': {
				int tam;
				for (int i = 0; i < n; i++) {
					for (int j = i+1; j < n; j++) {
						if (a[i] > a[j]) {
							tam = a[i];
							a[i] = a[j];
							a[j] = tam;
							/*a[i] += a[j];
							a[j] = a[i] - a[j];
							a[i] = a[i] - a[j];*/
						}
					}
				}
				
			}

				break;
			case 'e': {
				System.out.print("k = ");
				int p = Integer.parseInt(input.nextLine());
				int indexp = -1;
				for (int i = 0; i < n; i++) {
					if (p <= a[i]) {
						indexp = i;
						break;
					}
				}
				n++;
				
				if (indexp >= 0) {
					for (int i = n - 1; i > indexp; i--) {
						a[i] = a[i - 1];
					}
					a[indexp] = p;
				} else {
					a[n - 1] = p;
				}
				System.out.println("Xem mang:");
				for (int i = 0; i < n; i++) {
					System.out.print(a[i] + ";");
				}
				break;
			}
			case 'f':{
				System.out.println("Xem mang:");
				for (int i = 0; i < n; i++) {
					System.out.print(a[i] + ";");
				}
				break;
			}
			default: {
				System.out.println("Stop");
				break;
			}
			}
		} while (true);

	}
}
