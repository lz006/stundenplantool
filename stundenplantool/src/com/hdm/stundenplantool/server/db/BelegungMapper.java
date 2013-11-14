package com.hdm.stundenplantool.server.db;
import com.hdm.stundenplantool.shared.businessobject.Raum;





import java.sql.*;
import java.util.Vector;

import com.hdm.stundenplantool.shared.businessobject.Belegung;

/* Mapperklasse um Belegungs-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Timm Roth */

public class BelegungMapper {

	public Vector<Belegung> findByRaum(Raum raum){
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
   
   public Vector<Belegung> findByDozent(Dozent dozent) {
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
   
   public Vector<Belegung> findBySemesterverband(Semesterverband semesterverband) {
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
   
   public Belegung findByKey(Belegung belegung) {
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
   
   public Vector<Belegung> findAll() {
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
   
   
   public void deleteFromDB(Belegung belegung) {
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
   
   public Belegung updateDB(Belegung belegung) {
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
   
	
	private static BelegungMapper belegungMapper = null;
	
	protected BelegungMapper(){
		
	}
	
	public static BelegungMapper belegungMapper() {
	    if (belegungMapper == null) {
	    	belegungMapper = new BelegungMapper();
	    }

	    return belegungMapper;
	   }
	
	public Belegung insertIntoDB(Belegung belegung) {
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
	

}
