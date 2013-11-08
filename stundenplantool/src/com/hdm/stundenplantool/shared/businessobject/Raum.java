package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Raumes
 * @author: Lucas Zanella
 * @implement: Mathias Zimmermann
 */

public class Raum extends BusinessObject {
	
	public Raum (int RaumID, int Raumkapazitaet, String Raumbezeichnung) {
		this.RaumID = RaumID;
		this.Raumkapazitaet = Raumkapazitaet;
		this.Raumbezeichnung = Raumbezeichnung;
	}
	
	private int RaumID;
	private int Raumkapazitaet;
	private String Raumbezeichnung;
	
	
	
	public int getRaumID() {
		return RaumID;
	}
	public void setRaumID(int RaumID) {
		this.RaumID = RaumID;
	}
	public int getRaumkapazitaet() {
		return Raumkapazitaet;
	}
	public void setRaumkapazitaet(int Raumkapazitaet) {
		this.Raumkapazitaet = Raumkapazitaet;
	}
	public String getRaumbezeichnung() {
		return Raumbezeichnung;
	}
	public void setRaumbezeichnung(String Raumbezeichnung) {
		this.Raumbezeichnung = Raumbezeichnung;
	}
	
	

}
