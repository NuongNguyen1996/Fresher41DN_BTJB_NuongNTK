/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 13, 2018
@version: 
*/
package com.nuongntk.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		String csvFile = "C://Fresher41/Practice/File/STD.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[1] + " , name=" + country[2] + "]");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
