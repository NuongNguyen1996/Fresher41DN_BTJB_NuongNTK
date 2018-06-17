/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 13, 2018
@version: 
*/
package com.nuongntk.day10;

public class NhanVien {
	private String StdNo;
	private String StdName;
	private String StdPhone;
	private String StdEmail;
	private int GradePoint;
	
	public String getStdNo() {
		return StdNo;
	}

	public void setStdNo(String stdNo) {
		StdNo = stdNo;
	}

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public String getStdPhone() {
		return StdPhone;
	}

	public void setStdPhone(String stdPhone) {
		StdPhone = stdPhone;
	}

	public String getStdEmail() {
		return StdEmail;
	}

	public void setStdEmail(String stdEmail) {
		StdEmail = stdEmail;
	}

	public int getGradePoint() {
		return GradePoint;
	}

	public void setGradePoint(int gradePoint) {
		GradePoint = gradePoint;
	}

	public NhanVien() {
		super();
	}

	public NhanVien(String stdNo, String stdName, String stdPhone, String stdEmail, int  gradePoint) {
		super();
		StdNo = stdNo;
		StdName = stdName;
		StdPhone = stdPhone;
		StdEmail = stdEmail;
		GradePoint = gradePoint;
	}

	@Override
	public String toString() {
		return "NhanVien [StdNo=" + StdNo + ", StdName=" + StdName + ", StdPhone=" + StdPhone + ", StdEmail=" + StdEmail
				+ ", GradePoint=" + GradePoint + "]";
	}
	
	
	

}
