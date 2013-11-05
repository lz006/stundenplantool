package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Dozenten
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 */

public class Dozent extends BusinessObject {
	
	public Dozent (int dozentID, String vorname, String nachname) {
		this.dozentID = dozentID;
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	private int dozentID;
	private String vorname;
	private String nachname;
	
	
	
	public int getDozentID() {
		return dozentID;
	}
	public void setDozentID(int dozentID) {
		this.dozentID = dozentID;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	

}
