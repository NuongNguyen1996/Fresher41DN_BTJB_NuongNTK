/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 15, 2018
@version: 
*/
package com.nuongntk.qluv;

public class EmailException extends Exception{

	public EmailException() {
		super();
	}

	public EmailException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Sai định dạng email";
	}
	
	

	
}
