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

public class InternDAO {
	private ConnectDB objConnect = new ConnectDB();
	private PreparedStatement pstmt = null;

	// public void addNew
	public void addNewCandidate(Intern obj) {
		
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
			pstmt.setString(8, null);
			pstmt.setString(9, null);
			pstmt.setString(10, null);
			pstmt.setString(11, null);
			pstmt.setString(12, obj.getMajors());
			pstmt.setInt(13, obj.getSemester());
			pstmt.setString(14, obj.getUniversity_name());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
