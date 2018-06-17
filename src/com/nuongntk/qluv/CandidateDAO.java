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
}
