/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 12, 2018
@version: 
*/
package com.nuongntk.day4_5;

import java.util.Scanner;

public class Bai_7 {
	public static void main(String[] args) {
		/*7.	Nhập vào một String S,  thực hiện công việc sau:
			a.	In ra màn hình String đảo ngược của S
			b.	Đổi toàn bộ kí tự của S sang chữ Hoa
			c.	Đổi toàn bộ kí tự của S sang chữ thường
			d.	Đưa ra bảng tần số xuất hiện của các kí tự trong S
			e.	Trích ra chuỗi con của từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)*/
// input
		Scanner input = new Scanner(System.in);
		String S;
		System.out.print("enter value of S: "); 
		S = input.nextLine();
		int lenS = S.length();
		// process
		//a
		for (int i = S.length()-1; i>=0;i--) {
			System.out.print(S.charAt(i));
		}
		System.out.println();
		//b
		String strB = "";
		for (int i = 0;i<lenS;i++) {
			int c = (int)S.charAt(i);
			if (c >= 97 && c <= 122) {
				c -=32;
			}
			strB += (char)c;
		}
//		S = S.toUpperCase();
		System.out.println(strB);
		// c
		String strC = "";
		for (int i = 0;i<lenS;i++) {
			int c = (int)S.charAt(i);
			if (c >= 65 && c <= 90) {
				c +=32;
			}
			strC += (char)c;
		}
		System.out.println(strC);
		// d
		// cach 1:
		//sx
		char [] myList = S.toCharArray();
		for (int i = 0;i< lenS; i++) {
			for (int j = i+1; j < lenS; j++) {
				if (myList[i] > myList [j]) {
					char tam = myList[i];
					myList[i] = myList[j];
					myList[j] = tam;
				}
			}
		}
		// count
		int count = 1;
		for (int i = 1;i< lenS; i++) {
			if (myList[i-1] == myList[i]) {
				count++;
			}else {
				System.out.println(myList[i-1]+ ": "+ count);
				count = 1;
			}
		}
		System.out.println(myList[lenS-1]+ ": " + count);
		
		// cach 2:
		String tmp="";
//		 lenS = S.length(); 
		for (int i = 0; i < lenS; i++) {
			if(i == S.indexOf(S.charAt(i))) {
				tmp += S.charAt(i);
			}
		}
		
		int lenTmp = tmp.length();
		for (int i = 0;i<lenTmp; i++){
			count = 0;
			for (int j = 0;j<lenS;j++) {
				if (tmp.charAt(i) == S.charAt(j)) {
					count++;
				}
			}
			System.out.println(tmp.charAt(i) + ":" + count);
		}	
		// cach 3
		System.out.println("---------------");
		int ts[] = new int [255];
		for (int j = 0;j<lenS;j++) {
			ts[S.charAt(j)] ++;
		}
		
		for (int i = 0;i<255; i++) {
			if (ts[i] > 0) {
				System.out.println((char)i + ":" + ts[i]);
			}
		}
		// e
		int n, m;
		do{
			System.out.print("n = ");
			n = Integer.parseInt(input.nextLine());
		}
		while (n<0 || n>= lenS);
		do{
			System.out.print("m = ");
			m = Integer.parseInt(input.nextLine());
		}
		while (m < 0 || m>= lenS  || m <= n);
		System.out.println(S.substring(n,m +1));
	}
}
