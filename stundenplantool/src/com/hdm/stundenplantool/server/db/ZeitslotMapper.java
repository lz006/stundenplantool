package com.hdm.stundenplantool.server.db;
import com.hdm.stundenplantool.shared.businessobject.Belegung;

	import java.sql.*;

	import com.hdm.stundenplantool.shared.businessobject.Zeitslot;

	/* Mapperklasse um Zeitslot-Objekte aus und in die DB abzubilden
	@author: Herr Prof. Thies
	@implement: Mathias Zimmermann */

	public class ZeitslotMapper {

		public Zeitslot insertIntoDB(Zeitslot zeitslot) {
   Connection con = DBConnection.connection();
      		try{
      		Statement stmt = con.createStatement();
      		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+zeitslot.getId();
      		stmt.executeUpdate(sql1);
      		con.close();
      		}
      		catch (SQLException e1) {
      			
      		}
      	}
   
   public Zeitslot updateDB(Zeitslot zeitslot) {
   Connection con = DBConnection.connection();
         		try{
         		Statement stmt = con.createStatement();
         		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+zeitslot.getId();
         		stmt.executeUpdate(sql1);
         		con.close();
         		}
         		catch (SQLException e1) {
         			
         		}
         	}
   
   public void deleteFromDB(Zeitslot zeitslot) {
   Connection con = DBConnection.connection();
         		try{
         		Statement stmt = con.createStatement();
         		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+zeitslot.getId();
         		stmt.executeUpdate(sql1);
         		con.close();
         		}
         		catch (SQLException e1) {
         			
         		}
         	}
   
   public Zeitslot findByKey(int key) {
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
   
   public Vector<Zeitslot> findAll() {
   Connection con = DBConnection.connection();
         		try{
         		Statement stmt = con.createStatement();
         		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+.getId();
         		stmt.executeUpdate(sql1);
         		con.close();
         		}
         		catch (SQLException e1) {
         			
         		}
         	}
   
		
		private static ZeitslotMapper zeitslotMapper = null;
		
		protected ZeitslotMapper(){
			
		}
		
		public static ZeitslotMapper zeitslotMapper() {
		    if (zeitslotMapper == null) {
		    	zeitslotMapper = new ZeitslotMapper();
		    }

		    return zeitslotMapper;
		   }
		
}
