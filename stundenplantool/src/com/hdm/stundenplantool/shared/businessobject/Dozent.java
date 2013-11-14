package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Dozenten
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 */

public class Dozent extends BusinessObject {
	
	/*public Dozent (int dozentID, String vorname, String nachname) {
		super.setId(dozentID);
		this.vorname = vorname;
		this.nachname = nachname;
	}
	*/
	
	private static final long serialVersionUID = 1L;
	
	private String vorname;
	private int personalnummer;
	private String nachname;
	private Vector<Integer> belegungsFremdschluesselID = new Vector<Integer>() ;
	private Vector<Integer> lehrveranstaltungFremdschluesselID = new Vector<Integer>() ;

	
	
		public int getpersonalnummer() {
		return personalnummer;
	}

	public void setpersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

		public Vector<Integer> getbelegungsFremdschluesselID() {
		return belegungsFremdschluesselID;
	}

	public void setbelegungsFremdschluesselID(
			Vector<Integer> belegungsFremdschluesselID) {
		this.belegungsFremdschluesselID = belegungsFremdschluesselID;
	}

	public Vector<Integer> getlehrveranstaltungFremdschluesselID() {
		return lehrveranstaltungFremdschluesselID;
	}

	public void setlehrveranstaltungFremdschluesselID(Vector<Integer> lehrveranstaltungFremdschluesselID) {
		this.lehrveranstaltungFremdschluesselID = lehrveranstaltungFremdschluesselID;
	}
	
	
	
	
	public String getvorname() {
		return vorname;
	}
	public void setvorname(String vorname) {
		this.vorname = vorname;
	}
	public String getnachname() {
		return nachname;
	}
	public void setnachname(String nachname) {
		this.nachname = nachname;
	}
	
	public String toString() {
	    return super.toString() + " " + this.vorname + " " + this.nachname;
	  }
	

}