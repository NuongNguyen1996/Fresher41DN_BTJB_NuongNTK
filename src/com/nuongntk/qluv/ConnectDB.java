/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 14, 2018
@version: 
*/
package com.nuongntk.qluv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private Connection sqlCon = null;
	
	/**
	 * get connection string
	 * @return sqlcon
	 * @throws ClassNotFoundException, SQLException
	 */
	public Connection getconnect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			sqlCon = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyUngVien; username=nuongntk; password=N12345678@");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sqlCon;
	}
	
	/*public static void main(String[] args) {
		ConnectDB objConnect = new ConnectDB();
		if (objConnect.getconnect()!= null) {
			System.out.println("Ok connection");
		}
	}*/

}
