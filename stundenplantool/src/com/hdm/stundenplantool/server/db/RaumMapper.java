package com.hdm.stundenplantool.server.db;
import java.util.Vector;

import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Raum;

/* Mapperklasse um Raum-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Mathias Zimmermann */

public class RaumMapper {
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
   
   public Raum insertIntoDB(Raum raum) {
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
   
   public void deleteFromDB(Raum raum) {
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
   
   public Raum updateDB(Raum raum) {
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
   
   public Raum findByKey(int key) {
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
   
	
	private static RaumMapper raumMapper = null;
	
	protected RaumMapper(){
		
	}
	
	public static RaumMapper raumMapper() {
	    if (raumMapper == null) {
	    	raumMapper = new RaumMapper();
	    }

	    return raumMapper;
	   }
	

}
