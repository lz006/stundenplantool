package com.hdm.stundenplantool.server.db;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Semesterverband;

/* Mapperklasse um Semesterverbands-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Timm Roth */

public class SemesterverbandMapper {
	
	private static SemesterverbandMapper semesterverbandMapper = null;
	
	protected SemesterverbandMapper(){
		
	}
	
	public static SemesterverbandMapper semesterverbandMapper() {
	    if (semesterverbandMapper == null) {
	    	semesterverbandMapper = new SemesterverbandMapper();
	    }

	    return semesterverbandMapper;
	   }
	
	public void insertIntoDB(Semesterverband semesterverband) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Semesterverband (`Semesterverband ID`, `Semesterverbandsbezeichnung`, `Studiengang`, `AnzahlStudenten`, `Jahrgang`) VALUES ('"+semesterverband.getSemesterverbandID()+"', '"+semesterverband.getSemesterverbandsbezeichnung()+"', '"+semesterverband.getStudiengang()+"', '"+semesterverband.getAnzahlStudenten()+", '"+semesterverband.getJahrgang()+")";
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
	

}
