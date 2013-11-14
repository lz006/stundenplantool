package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation einer realen Belegung
 * @author: Lucas Zanella
 * @implement: Timm Roth
 */

public class Belegung extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	
	private int lehrveranstaltungID;
	private int raumID;
	private int zeitslotID;
	private int dozentID;
	

	public int getLehrveranstaltungID() {
		return lehrveranstaltungID;
	}


	public void setLehrveranstaltungID(int lehrveranstaltungID) {
		this.lehrveranstaltungID = lehrveranstaltungID;
	}


	public int getRaumID() {
		return raumID;
	}


	public void setRaumID(int raumID) {
		this.raumID = raumID;
	}


	public int getZeitslotID() {
		return zeitslotID;
	}


	public void setZeitslotID(int zeitslotID) {
		this.zeitslotID = zeitslotID;
	}


	public int getDozentID() {
		return dozentID;
	}


	public void setDozentID(int dozentID) {
		this.dozentID = dozentID;
	}


	public String toString() {
	    return super.toString() + " " + this.lehrveranstaltungID + " " + this.raumID + " " + this.zeitslotID + " " + this.dozentID;
	  }
	

}
