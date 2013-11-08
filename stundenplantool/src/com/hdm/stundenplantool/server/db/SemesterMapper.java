package com.hdm.stundenplantool.server.db;

import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Semester;

/* Mapperklasse um Semester-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Mathias Zimmermann */

public class SemesterMapper {
	
	private static SemesterMapper semesterMapper = null;
	
	protected SemesterMapper(){
		
	}
	
	public static SemesterMapper semesterMapper() {
	    if (semesterMapper == null) {
	    	semesterMapper = new SemesterMapper();
	    }

	    return semesterMapper;
	   }
	
	public void insertIntoDB(Semester semester) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Semester (`Semester ID`, `Semesterbezeichnung`) VALUES ('"+semester.getSemesterID()+"', '"+semester.getSemesterbezeichnung()+"')";
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
}