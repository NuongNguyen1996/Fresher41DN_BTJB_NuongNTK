package com.nuongntk.qluv;

public abstract class Candidate implements Comparable<Candidate> {
	private String candidateID;
	private String fullName;
	private String birthDay;
	private String phone;
	private String email;
	private int candidate_type;
	private static int canidate_count = 0;

	public String getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCandidate_type() {
		return candidate_type;
	}

	public void setCandidate_type(int candidate_type) {
		this.candidate_type = candidate_type;
	}

	public static int getCanidate_count() {
		return canidate_count;
	}

	public static void setCanidate_count() {
		Candidate.canidate_count++;
	}

	public Candidate(String candidateID, String fullName, String birthDay, String phone, String email,
			int candidate_type) {
		super();
		canidate_count++;
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.candidate_type = candidate_type;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void showInfo() {
		System.out.println("candidateID: " + candidateID);
		System.out.println("fullName: " + fullName);
		System.out.println("birthDay: " + birthDay);
		System.out.println("phone: " + phone);
		System.out.println("email: " + email);
		System.out.println("candidate_type: " + candidate_type);
	}

	public abstract void showMe();

	@Override
	public int compareTo(Candidate arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Candidate) {
			return this.candidateID.equals(((Candidate) obj).candidateID);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.candidateID.hashCode();
	}
	
	

}
