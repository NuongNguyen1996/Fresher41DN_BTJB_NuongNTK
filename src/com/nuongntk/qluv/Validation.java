package com.nuongntk.qluv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Validation {
	private final static String EMAIL_PARTENT = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private final static String PHONE_PARTENT = "^[0-9]{10,25}$";
	private final static String DATE_FORMAT = "yyyy-MM-dd";
	private final static int YEAR_START = 1990;
	static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	static Calendar cal = Calendar.getInstance();
	/**
	 * check email
	 * @param email
	 * @return boolean
	 */
	public static boolean isEmail(String email) {
		return email.matches(EMAIL_PARTENT);
		
	}
	/**
	 * check phone number
	 * @param phone
	 * @return boolean
	 */
	public static boolean isPhone(String phone) {
		return phone.matches(PHONE_PARTENT);
	}
	/**
	 * check valid date
	 * @param date
	 * @return true/false
	 */
	public static boolean isDate(String date) {
		try {
			Date date1 = new Date(date); 
			String date2 = format1.format(date1);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	/**
	 * format date string
	 * @param date
	 * @return string
	 */
	public static String formatDate(String date) {
		if (isDate(date)) {
			Date date1 = new Date(date); 
			return format1.format(date1);
		}
		return null;
	}
	/**
	 * get a year from date
	 * @param date
	 * @return int type
	 */
	public static int getYear(String date) {
		return Integer.parseInt(formatDate(date).substring(0,4));
	}
	
	/**
	 * check year valid
	 * @param date
	 * @returntrue/false
	 */
	public static boolean checkYear(String date) {
		int year = getYear(date);
		int yearNow = cal.get(Calendar.YEAR);
		if (year >= YEAR_START && year <= yearNow) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String datestr = "12/12/2017";
		System.out.println(formatDate(datestr));
	}

	

}
