/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 14, 2018
@version: 
*/
package com.nuongntk.qluv;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CandidateDAO {
	private ConnectDB objConnect = new ConnectDB();
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Statement stmt = null;

	/**
	 * check existance of candidate id
	 * 
	 * @param candidateID
	 * @return true/false
	 */
	public boolean isIDExist(String candidateID) {

		String sql = "select * from Candidate where CandidateID = ?";
		try {
			pstmt = objConnect.getconnect().prepareStatement(sql);
			pstmt.setString(1, candidateID);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * get add fullname
	 * 
	 * @return sbf
	 */
	public String getAllFullName() {
		StringBuffer sbf = new StringBuffer("");
		String s = "";
		String sql = "select fullname from candidate";
		try {
			stmt = objConnect.getconnect().createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				s = rs.getString("fullname");
				sbf.append(s + ", ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sbf.toString();
	}

	public Set<Candidate> getListCandidate() {
		Set<Candidate> lc = new HashSet<>();
		Candidate candidate;

		String candidateID;
		String fullName;
		String birthDay;
		String phone;
		String email;
		int candidate_type;
		int expInYear;
		String proSkill;
		String graduationDate;
		String graduationRank;
		String education;
		String majors;
		int semester;
		String universityName;

		String sql = "select * from candidate";
		try {
			stmt = objConnect.getconnect().createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				candidateID = rs.getString("candidateID");
				fullName = rs.getString("fullName");
				birthDay = rs.getString("birthDay");
				phone = rs.getString("phone");
				email = rs.getString("email");
				candidate_type = rs.getInt("CandidateTypeID");

				switch (candidate_type) {
				case 1: {
					expInYear = rs.getInt("expInYear");
					proSkill = rs.getString("proSkill");
					candidate = new Experience(candidateID, fullName, birthDay, phone, email, candidate_type, expInYear,
							proSkill);
					lc.add(candidate);
				}
					break;
				case 2: {
					graduationDate = rs.getString("graduationDate");
					graduationRank = rs.getString("graduationRank");
					education = rs.getString("education");
					candidate = new Fresher(candidateID, fullName, birthDay, phone, email, candidate_type,
							graduationDate, graduationRank, education);
					lc.add(candidate);
				}
					break;
				case 3: {
					majors = rs.getString("majors");
					semester = rs.getInt("semester");
					universityName = rs.getString("universityName");
					candidate = new Intern(candidateID, fullName, birthDay, phone, email, candidate_type, majors,
							semester, universityName);
					lc.add(candidate);
				}
					break;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return lc;
	}
	
	public List<Candidate> getListCandidate1() {
		List<Candidate> lc = new ArrayList<>();
		Candidate candidate;

		String candidateID;
		String fullName;
		String birthDay;
		String phone;
		String email;
		int candidate_type;
		int expInYear;
		String proSkill;
		String graduationDate;
		String graduationRank;
		String education;
		String majors;
		int semester;
		String universityName;

		String sql = "select * from candidate";
		try {
			stmt = objConnect.getconnect().createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				candidateID = rs.getString("candidateID");
				fullName = rs.getString("fullName");
				birthDay = rs.getString("birthDay");
				phone = rs.getString("phone");
				email = rs.getString("email");
				candidate_type = rs.getInt("CandidateTypeID");

				switch (candidate_type) {
				case 1: {
					expInYear = rs.getInt("expInYear");
					proSkill = rs.getString("proSkill");
					candidate = new Experience(candidateID, fullName, birthDay, phone, email, candidate_type, expInYear,
							proSkill);
					lc.add(candidate);
				}
					break;
				case 2: {
					graduationDate = rs.getString("graduationDate");
					graduationRank = rs.getString("graduationRank");
					education = rs.getString("education");
					candidate = new Fresher(candidateID, fullName, birthDay, phone, email, candidate_type,
							graduationDate, graduationRank, education);
					lc.add(candidate);
				}
					break;
				case 3: {
					majors = rs.getString("majors");
					semester = rs.getInt("semester");
					universityName = rs.getString("universityName");
					candidate = new Intern(candidateID, fullName, birthDay, phone, email, candidate_type, majors,
							semester, universityName);
					lc.add(candidate);
				}
					break;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return lc;
	}
}
