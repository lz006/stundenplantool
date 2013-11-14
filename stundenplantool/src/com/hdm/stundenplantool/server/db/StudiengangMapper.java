package com.hdm.stundenplantool.server.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.hdm.stundenplantool.shared.businessobject.Studiengang;

public class StudiengangMapper {

private static StudiengangMapper studiengangMapper = null;

protected StudiengangMapper(){
	
}

public static StudiengangMapper studiengangMapper() {
    if (studiengangMapper == null) {
    	studiengangMapper = new StudiengangMapper();
    }

    return studiengangMapper;
   }

public void insertIntoDB(Studiengang studiengang) {
	Connection con = DBConnection.connection();
	try{
	Statement stmt = con.createStatement();
	String sql1 = "INSERT INTO Studiengang (`Studiengang ID`) VALUES ('"+studiengang.getId()+"')";
	stmt.executeUpdate(sql1);
	con.close();
	}
	catch (SQLException e1) {
		
	}
}
}
