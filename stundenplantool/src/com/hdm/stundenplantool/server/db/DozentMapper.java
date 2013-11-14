package com.hdm.stundenplantool.server.db;
import java.util.Vector;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Dozent;

/* Mapperklasse um Dozenten-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Lucas Zanella */

public class DozentMapper {
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
   
   public Dozent insertIntoDB(Dozent dozent) {
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
   
   public void deleteFromDB(Dozent dozent) {
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
   
   public Dozent updateDB(Dozent dozent) {
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
   
   public Dozent findByKey(int key) {
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
   
	
	private static DozentMapper dozentMapper = null;
	
	protected DozentMapper(){
		
	}
	
	public static DozentMapper dozentMapper() {
	    if (dozentMapper == null) {
	      dozentMapper = new DozentMapper();
	    }

	    return dozentMapper;
	   }
	

}
