package com.hdm.stundenplantool.server.db;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Lehrveranstaltung;

/* Mapperklasse um Lehrveranstaltungs-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Timm Roth */

public class LehrveranstaltungMapper {
	
	private static LehrveranstaltungMapper lehrveranstaltungMapper = null;
	
	protected LehrveranstaltungMapper(){
		
	}
	
	public static LehrveranstaltungMapper lehrveranstaltungMapper() {
	    if (lehrveranstaltungMapper == null) {
	    	lehrveranstaltungMapper = new LehrveranstaltungMapper();
	    }

	    return lehrveranstaltungMapper;
	   }
	
	public void insertIntoDB(Lehrveranstaltung lehrveranstaltung) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Lehrveranstaltung (`Lehrveranstaltung ID`, `Lehrveranstaltungsumfang`, `Lehrveranstaltungsbezeichnung`) VALUES ('"+lehrveranstaltung.getLehrveranstaltungID()+"', '"+lehrveranstaltung.getLehrveranstaltungsumfang()+"', '"+lehrveranstaltung.getLehrveranstaltungsbezeichnung()+"')";
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
	

}
