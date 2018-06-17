package com.nuongntk.qluv;

public class Fresher extends Candidate{
private String graduation_date;
private String graduation_rank;
private String education;

	public Fresher(String candidateID, String fullName, String birthDay, String phone, String email, int candidate_type,
		String graduation_date, String graduation_rank, String education) {
	super(candidateID, fullName, birthDay, phone, email, candidate_type);
	this.graduation_date = graduation_date;
	this.graduation_rank = graduation_rank;
	this.education = education;
}

	public Fresher() {
	super();
	// TODO Auto-generated constructor stub
}

	public String getGraduation_date() {
		return graduation_date;
	}

	public void setGraduation_date(String graduation_date) {
		this.graduation_date = graduation_date;
	}

	public String getGraduation_rank() {
		return graduation_rank;
	}

	public void setGraduation_rank(String graduation_rank) {
		this.graduation_rank = graduation_rank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public void showMe() {
		showInfo();
		System.out.println("graduation_date: " + graduation_date);
		System.out.println("graduation_rank: " + graduation_rank);
		System.out.println("education: " + education);
		System.out.println("=====================");
	}
}
