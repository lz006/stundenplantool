package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

/*Ein Objekt dieser Klasse ist eine Repräsentation einer realen Lehrveranstaltung
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 */

public class Lehrveranstaltung extends BusinessObject {

	private static final long serialVersionUID = 1L;
	
	private int lehrveranstaltungsumfang;
	private String lehrveranstaltungsbezeichnung;
	private int dozentID;
	private int semesterverbandID;
	private int semester;
	private Vector<Integer> belegungsFremdschluesselID = new Vector<Integer>() ;
	private Vector<Integer> dozentFremdschluesselID = new Vector<Integer>() ;

	
	
		public Vector<Integer> getbelegungsFremdschluesselID() {
		return belegungsFremdschluesselID;
	}

	public void setbelegungsFremdschluesselID(
			Vector<Integer> belegungsFremdschluesselID) {
		this.belegungsFremdschluesselID = belegungsFremdschluesselID;
	}

	public Vector<Integer> getdozentFremdschluesselID() {
		return dozentFremdschluesselID;
	}

	public void setdozentfremdschluesselID(Vector<Integer> dozentFremdschluesselID) {
		this.dozentFremdschluesselID = dozentFremdschluesselID;
	}


	public int getlehrveranstaltungsumfang() {
		return lehrveranstaltungsumfang;
	}


	public void setlehrveranstaltungsumfang(int lehrveranstaltungsumfang) {
		this.lehrveranstaltungsumfang = lehrveranstaltungsumfang;
	}


	public String getlehrveranstaltungsbezeichnung() {
		return lehrveranstaltungsbezeichnung;
	}


	public void setlehrveranstaltungsbezeichnung(
			String lehrveranstaltungsbezeichnung) {
		this.lehrveranstaltungsbezeichnung = lehrveranstaltungsbezeichnung;
	}


	public int getdozentID() {
		return dozentID;
	}


	public void setdozentID(int dozentID) {
		this.dozentID = dozentID;
	}


	public int getsemesterverbandID() {
		return semesterverbandID;
	}


	public void setsemesterverbandID(int semesterverbandID) {
		this.semesterverbandID = semesterverbandID;
	}


	public int getsemester() {
		return semester;
	}


	public void setsemester(int semester) {
		this.semester = semester;
	}


	public String toString() {
	    return super.toString() + " " + this.lehrveranstaltungsumfang + " " + this.lehrveranstaltungsbezeichnung + " " + this.dozentID + " " + this.semesterverbandID + " " + this.semester;
	  }
	
	}
