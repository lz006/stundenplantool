package com.hdm.stundenplantool.server.db;


import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Dozent;

/* Mapperklasse um Dozenten-Objekte aus und in die DB abzubilden
 * @author: Herr Prof. Thies
 * @implement: Lucas Zanella 
 * */

public class DozentMapper {
	
	private static DozentMapper dozentMapper = null;
	
	protected DozentMapper(){
		
	}
	
	public static DozentMapper dozentMapper() {
	    if (dozentMapper == null) {
	      dozentMapper = new DozentMapper();
	    }

	    return dozentMapper;
	   }
	
	public void insertIntoDB(Dozent dozent) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Dozent (`Dozent ID`, `Vorname`, `Nachname`) VALUES ('"+dozent.getId()+"', '"+dozent.getVorname()+"', '"+dozent.getNachname()+"')";
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
	

}
