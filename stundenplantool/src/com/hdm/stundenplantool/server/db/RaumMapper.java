package com.hdm.stundenplantool.server.db;

import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Raum;

/* Mapperklasse um Raum-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Mathias Zimmermann */

public class RaumMapper {
	
	private static RaumMapper raumMapper = null;
	
	protected RaumMapper(){
		
	}
	
	public static RaumMapper raumMapper() {
	    if (raumMapper == null) {
	    	raumMapper = new RaumMapper();
	    }

	    return raumMapper;
	   }
	
	public void insertIntoDB(Raum raum) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Raum (`Raum ID`, `Raumkapazitaet`, `Raumbezeichnung`) VALUES ('"+raum.getRaumID()+"', '"+raum.getRaumkapazitaet()+"', '"+raum.getRaumbezeichnung()+"')";
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
	

}
