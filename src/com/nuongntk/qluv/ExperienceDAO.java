/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 14, 2018
@version: 
*/
package com.nuongntk.qluv;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExperienceDAO {
	private ConnectDB objConnect = new ConnectDB();
	private PreparedStatement pstmt = null;

	// public void addNew
	public void addNewCandidate(Experience obj) {
		
		String sql = "insert into candidate" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = objConnect.getconnect().prepareStatement(sql);
			pstmt.setString(1, obj.getCandidateID());
			pstmt.setString(2, obj.getFullName());
			pstmt.setString(3, obj.getBirthDay());
			pstmt.setString(4, obj.getPhone());
			pstmt.setString(5, obj.getEmail());
			pstmt.setInt(6, obj.getCandidate_type());
			pstmt.setInt(7, obj.getExpInYear());
			pstmt.setString(8, obj.getProSkill());
			pstmt.setString(9, null);
			pstmt.setString(10, null);
			pstmt.setString(11, null);
			pstmt.setString(12, null);
			pstmt.setInt(13, 0);
			pstmt.setString(14, null);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
