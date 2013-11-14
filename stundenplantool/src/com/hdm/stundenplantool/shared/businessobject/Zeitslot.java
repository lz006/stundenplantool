package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Zeitslots
 * @author: Lucas Zanella
 * @implement: Timm Roth
 */

public class Zeitslot extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	
	private int zeitslotendzeit;
	private int zeitslotanfangszeit;
	private Vector<Integer> belegungsFremdschluesselID = new Vector<Integer>() ;

	
	
		public Vector<Integer> getbelegungsFremdschluesselID() {
		return belegungsFremdschluesselID;
	}

	public void setbelegungsFremdschluesselID(
			Vector<Integer> belegungsFremdschluesselID) {
		this.belegungsFremdschluesselID = belegungsFremdschluesselID;
	}

	public int getzeitslotendzeit() {
		return zeitslotendzeit;
	}




	public void setzeitslotendzeit(int zeitslotendzeit) {
		this.zeitslotendzeit = zeitslotendzeit;
	}




	public int getzeitslotanfangszeit() {
		return zeitslotanfangszeit;
	}




	public void setzeitslotanfangszeit(int zeitslotanfangszeit) {
		this.zeitslotanfangszeit = zeitslotanfangszeit;
	}




	public String toString() {
	    return super.toString() + " " + this.zeitslotendzeit + " " + this.zeitslotanfangszeit;
	  }
	

}
