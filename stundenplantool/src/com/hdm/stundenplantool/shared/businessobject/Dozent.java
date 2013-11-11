package com.hdm.stundenplantool.shared.businessobject;

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
	private String nachname;
	
	
	
	
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
	
	public String toString() {
	    return super.toString() + " " + this.vorname + " " + this.nachname;
	  }
	

}
