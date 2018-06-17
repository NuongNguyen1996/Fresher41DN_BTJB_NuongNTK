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

public class FresherDAO {
	private ConnectDB objConnect = new ConnectDB();
	private PreparedStatement pstmt = null;

	// public void addNew
	public void addNewCandidate(Fresher obj) {
		
		String sql = "insert into candidate" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = objConnect.getconnect().prepareStatement(sql);
			pstmt.setString(1, obj.getCandidateID());
			pstmt.setString(2, obj.getFullName());
			pstmt.setString(3, obj.getBirthDay());
			pstmt.setString(4, obj.getPhone());
			pstmt.setString(5, obj.getEmail());
			pstmt.setInt(6, obj.getCandidate_type());
			pstmt.setInt(7, 0);
			pstmt.setString(8,null);
			pstmt.setString(9, obj.getGraduation_date());
			pstmt.setString(10, obj.getGraduation_rank());
			pstmt.setString(11, obj.getEducation());
			pstmt.setString(12, null);
			pstmt.setInt(13, 0);
			pstmt.setString(14, null);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
