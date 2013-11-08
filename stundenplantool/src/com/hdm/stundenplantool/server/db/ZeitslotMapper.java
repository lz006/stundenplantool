package com.hdm.stundenplantool.server.db;

	import java.sql.*;

	import com.hdm.stundenplantool.shared.businessobject.Zeitslot;

	/* Mapperklasse um Zeitslot-Objekte aus und in die DB abzubilden
	@author: Herr Prof. Thies
	@implement: Mathias Zimmermann */

	public class ZeitslotMapper {
		
		private static ZeitslotMapper zeitslotMapper = null;
		
		protected ZeitslotMapper(){
			
		}
		
		public static ZeitslotMapper zeitslotMapper() {
		    if (zeitslotMapper == null) {
		    	zeitslotMapper = new ZeitslotMapper();
		    }

		    return zeitslotMapper;
		   }
		
		public void insertIntoDB(Zeitslot zeitslot) {
			Connection con = DBConnection.connection();
			try{
			Statement stmt = con.createStatement();
			String sql1 = "INSERT INTO Zeitslot (`Zeitslot ID`, `Zeitslotanfangszeit`, `Zeitslotendzeit`) VALUES ('"+zeitslot.getZeitslotID()+"', '"+zeitslot.getZeitslotanfangszeit()+"', '"+zeitslot.getZeitslotendzeit()+"')";
			stmt.executeUpdate(sql1);
			con.close();
			}
			catch (SQLException e1) {
				
			}
		}
		
}
