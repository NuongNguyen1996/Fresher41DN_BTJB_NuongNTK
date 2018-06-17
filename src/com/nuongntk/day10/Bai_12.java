/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 13, 2018
@version: 
*/
package com.nuongntk.day10;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bai_12 {
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static String PHONE_PATTERN = "^[0-9]{11}$";

	/**
	 * validateEmail
	 * 
	 * @param email
	 * @return true/false
	 */
	public static boolean validateEmail(String email) {
		return email.matches(EMAIL_PATTERN);
	}

	/**
	 * validate Phone
	 * 
	 * @param phone
	 * @return true/false
	 */
	public static boolean validatePhone(String phone) {
		return phone.matches(PHONE_PATTERN);
	}

	/**
	 * check data
	 * 
	 * @param fileName
	 * @param fileErr
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void checkData(String fileName, String fileErr) throws FileNotFoundException, IOException {
		File file = new File(fileErr);
		if (!file.exists()) {
			file.createNewFile();
		}
		DataOutputStream stream = new DataOutputStream(new FileOutputStream(file));
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = "", email, phone;
			int lineNumber = 0;
			while ((line = br.readLine()) != null) {
				lineNumber++;
				// use comma as separator
				String[] data = line.split(",");
				phone = data[2];
				email = data[3];
				boolean checkEmail = validateEmail(email), checkPhone = validatePhone(phone);
				if (!checkEmail && !checkPhone) {
					stream.writeBytes("Line " + lineNumber + ": Sai loi dinh dang email, phone");
					stream.writeBytes("\r\n");
				} else if (!checkEmail) {
					stream.writeBytes("Line " + lineNumber + ": Sai loi dinh dang email");
					stream.writeBytes("\r\n");
				} else if (!checkPhone) {
					stream.writeBytes("Line " + lineNumber + ": Sai loi dinh dang phone");
					stream.writeBytes("\r\n");
				}
			}
		}
	}

	public static void readData(String fileInput) {
		NhanVien nv;
		ArrayList<NhanVien> listNV = new ArrayList<>();
		String line = "";
		String stdNo, stdName, stdPhone, stdEmail;
		int gradePoint;

		try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				stdNo = data[0];
				stdName = data[1];
				stdPhone = data[2];
				stdEmail = data[3];
				// replace " by blank charactor
				data[4] = data[4].replace("\"", "");
				gradePoint = Integer.parseInt(data[4]);
				nv = new NhanVien(stdNo, stdName, stdPhone, stdEmail, gradePoint);
				listNV.add(nv);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (NhanVien objNV : listNV) {
			System.out.println(objNV.toString());
		}

	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String csvFile = "C://Fresher41/Practice/File/STD.csv";
		String fileErr = "C://Fresher41/Practice/File/err.txt";
		// a
		readData(csvFile);
		//b
		checkData(csvFile, fileErr);
	}

}
