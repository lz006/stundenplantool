package com.hdm.stundenplantool.server.db;
import java.util.Vector;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Semesterverband;

/* Mapperklasse um Semesterverbands-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Timm Roth */

public class SemesterverbandMapper {
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
   
   public Semesterverband insertIntoDB(Semesterverband semesterverband) {
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
   
   public void deleteFromDB(Semesterverband semesterverband) {
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
   
   public Semesterverband updateDB(Semesterverband semesterverband) {
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
   
   public Semesterverband findByKey(int key) {
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
   
	
	private static SemesterverbandMapper semesterverbandMapper = null;
	
	protected SemesterverbandMapper(){
		
	}
	
	public static SemesterverbandMapper semesterverbandMapper() {
	    if (semesterverbandMapper == null) {
	    	semesterverbandMapper = new SemesterverbandMapper();
	    }

	    return semesterverbandMapper;
	   }
	

}
