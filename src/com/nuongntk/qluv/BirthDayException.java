/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 15, 2018
@version: 
*/
package com.nuongntk.qluv;

public class BirthDayException extends Exception{

	public BirthDayException() {
		
	}
	
	public BirthDayException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Sai dinh dạng ngày sinh";
	}
	
	

}
