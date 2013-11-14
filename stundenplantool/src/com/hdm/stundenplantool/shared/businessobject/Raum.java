package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Raumes
 * @author: Lucas Zanella
 * @implement: Mathias Zimmermann
 */

public class Raum extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	
	private int raumkapazitaet;
	private String raumbezeichnung;
	private Vector<Integer> belegungsFremdschluesselID = new Vector<Integer>() ;

	
	
		public Vector<Integer> getbelegungsFremdschluesselID() {
		return belegungsFremdschluesselID;
	}

	public void setbelegungsFremdschluesselID(
			Vector<Integer> belegungsFremdschluesselID) {
		this.belegungsFremdschluesselID = belegungsFremdschluesselID;
	}

	public int getraumkapazitaet() {
		return raumkapazitaet;
	}


	public void setraumkapazitaet(int raumkapazitaet) {
		this.raumkapazitaet = raumkapazitaet;
	}


	public String getraumbezeichnung() {
		return raumbezeichnung;
	}


	public void setraumbezeichnung(String raumbezeichnung) {
		this.raumbezeichnung = raumbezeichnung;
	}


	public String toString() {
	    return super.toString() + " " + this.raumkapazitaet + " " + this.raumbezeichnung;
	  }
	
	
	

}
