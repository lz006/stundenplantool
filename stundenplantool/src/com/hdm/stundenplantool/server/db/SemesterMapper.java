package com.hdm.stundenplantool.server.db;
import java.util.Vector;

import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Semester;

/* Mapperklasse um Semester-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Mathias Zimmermann */

public class SemesterMapper {
public Vector <Belegung> findAll() {
   Connection con = DBConnection.connection();
            		try{
            		Statement stmt = con.createStatement();
            		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+belegung.getId();
            		stmt.executeUpdate(sql1);
            		con.close();
            		}
            		catch (SQLException e1) {
            			
            		}
            	}
   
   public Semester insertIntoDB(Semester semester) {
   Connection con = DBConnection.connection();
      		try{
      		Statement stmt = con.createStatement();
      		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+belegung.getId();
      		stmt.executeUpdate(sql1);
      		con.close();
      		}
      		catch (SQLException e1) {
      			
      		}
      	}
   
   public void deleteFromDB(Semester semester) {
   Connection con = DBConnection.connection();
         		try{
         		Statement stmt = con.createStatement();
         		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+belegung.getId();
         		stmt.executeUpdate(sql1);
         		con.close();
         		}
         		catch (SQLException e1) {
         			
         		}
         	}
   
   public Semester updateDB(Semester semester) {
   Connection con = DBConnection.connection();
         		try{
         		Statement stmt = con.createStatement();
         		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+belegung.getId();
         		stmt.executeUpdate(sql1);
         		con.close();
         		}
         		catch (SQLException e1) {
         			
         		}
         	}
   
   public Semester findByKey(int key) {
   Connection con = DBConnection.connection();
            		try{
            		Statement stmt = con.createStatement();
            		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+key.getId();
            		stmt.executeUpdate(sql1);
            		con.close();
            		}
            		catch (SQLException e1) {
            			
            		}
            	}
   
	
	private static SemesterMapper semesterMapper = null;
	
	protected SemesterMapper(){
		
	}
	
	public static SemesterMapper semesterMapper() {
	    if (semesterMapper == null) {
	    	semesterMapper = new SemesterMapper();
	    }

	    return semesterMapper;
	   }
}