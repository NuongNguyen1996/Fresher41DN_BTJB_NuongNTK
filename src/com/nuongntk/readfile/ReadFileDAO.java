package com.nuongntk.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nuongntk.day10.NhanVien;

public class ReadFileDAO {
	
	private Statement stmt = null;
	private PreparedStatement ptsm = null;
	List<String> ls = new ArrayList<>();
	
	public void createTable(String fileInput) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {

			while ((br.read()) != -1) {
//				ls.add(br.re)
//				// replace " by blank charactor
//				data[4] = data[4].replace("\"", "");
//				gradePoint = Integer.parseInt(data[4]);
//				nv = new NhanVien(stdNo, stdName, stdPhone, stdEmail, gradePoint);
//				listNV.add(nv);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
