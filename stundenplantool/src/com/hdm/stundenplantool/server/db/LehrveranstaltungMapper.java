package com.hdm.stundenplantool.server.db;
import java.util.Vector;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Lehrveranstaltung;

/* Mapperklasse um Lehrveranstaltungs-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Timm Roth */

public class LehrveranstaltungMapper {
public Lehrveranstaltung findByKey(int key) {
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
   
   public Lehrveranstaltung updateDB(Lehrveranstaltung lehrveranstaltung) {
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
   
   public void deleteFromDB(Lehrveranstaltung lehrveranstaltung) {
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
   
   public Lehrveranstaltung insertIntoDB(Lehrveranstaltung lehrveranstaltung) {
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
   
	
	private static LehrveranstaltungMapper lehrveranstaltungMapper = null;
	
	protected LehrveranstaltungMapper(){
		
	}
	
	public static LehrveranstaltungMapper lehrveranstaltungMapper() {
	    if (lehrveranstaltungMapper == null) {
	    	lehrveranstaltungMapper = new LehrveranstaltungMapper();
	    }

	    return lehrveranstaltungMapper;
	   }
	

}
