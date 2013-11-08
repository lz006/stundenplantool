package com.hdm.stundenplantool.server.db;




import java.sql.*;

import com.hdm.stundenplantool.shared.businessobject.Stundenplan;

/* Mapperklasse um Stundenplan-Objekte aus und in die DB abzubilden
@author: Herr Prof. Thies
@implement: Mathias Zimmermann */

public class StundenplanMapper {
	
	private static StundenplanMapper StundenplanMapper = null;
	
	protected StundenplanMapper(){
		
	}
	
	public static StundenplanMapper stundenplanMapper() {
	    if (StundenplanMapper == null) {
	    	StundenplanMapper = new StundenplanMapper();
	    }

	    return StundenplanMapper;
	   }
	
	public void insertIntoDB(Stundenplan stundenplan) {
		Connection con = DBConnection.connection();
		try{
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO Stundenplan (`Stundenplan ID`, `Studienhalbjahr`) VALUES ('"+stundenplan.getStundenplanID()+"', '"+stundenplan.getStudienhalbjahr()+"')";
		stmt.executeUpdate(sql1);
		con.close();
		}
		catch (SQLException e1) {
			
		}
	}
	

}
