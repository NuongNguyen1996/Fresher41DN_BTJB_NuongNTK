package com.nuongntk.qluv;

public class Experience extends Candidate {
	private int expInYear;
	private String proSkill;

	public Experience(String candidateID, String fullName, String birthDay, String phone, String email,
			int candidate_type, int expInYear, String proSkill) {
		super(candidateID, fullName, birthDay, phone, email, candidate_type);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public void showMe() {
		showInfo();
		System.out.println("expInYear: " + expInYear);
		System.out.println("proSkill: " + proSkill);
		System.out.println("=====================");
	}

	@Override
	public int compareTo(Candidate obj) {
		String fullName = ((Experience) obj).getFullName();
		return (this.getFullName().compareTo(fullName));
	}
	
	
	

}
