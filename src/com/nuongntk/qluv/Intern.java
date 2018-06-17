package com.nuongntk.qluv;

public class Intern extends Candidate {
	private String majors;
	private int semester;
	private String university_name;

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(String candidateID, String fullName, String birthDay, String phone, String email, int candidate_type,
			String majors, int semester, String university_name) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		this.majors = majors;
		this.semester = semester;
		this.university_name = university_name;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	@Override
	public void showMe() {
		showInfo();
		System.out.println("majors: " + majors);
		System.out.println("semester: " + semester);
		System.out.println("university_name: " + university_name);
		System.out.println("=====================");
	}

}
