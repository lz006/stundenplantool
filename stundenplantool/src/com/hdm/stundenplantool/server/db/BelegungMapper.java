package com.hdm.stundenplantool.server.db;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Belegung;

/* Mapperklasse um Belegungs-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Timm Roth */

public class BelegungMapper {
	
	private static BelegungMapper belegungMapper = null;
	
	protected BelegungMapper(){
		
	}
	
	public static BelegungMapper belegungMapper() {
	    if (belegungMapper == null) {
	    	belegungMapper = new BelegungMapper();
	    }

	    return belegungMapper;
	   }
	
	public void insertIntoDB(Belegung belegung) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Belegung (`Belegung ID`) VALUES ('"+belegung.getBelegungID();
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
	

}
