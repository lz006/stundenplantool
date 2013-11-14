package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Semesterverbands
 * @author: Lucas Zanella
 * @implement: Mathias Zimmermann
 */
public class Semesterverband extends BusinessObject {
	private static final long serialVersionUID = 1L;
	
	private String studiengang;
	private int semester;
	private String jahrgang;
	private String semesterverbandbezeichnung;
	private int anzahlStudenten;
	private Vector<Integer> belegungsFremdschluesselID = new Vector<Integer>() ;

	
	
		public Vector<Integer> getbelegungsFremdschluesselID() {
		return belegungsFremdschluesselID;
	}

	public void setbelegungsFremdschluesselID(
			Vector<Integer> belegungsFremdschluesselID) {
		this.belegungsFremdschluesselID = belegungsFremdschluesselID;
	}

		
		public String getstudiengang() {
		return studiengang;
	}

	public void setstudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	public int getsemester() {
		return semester;
	}

	public void setsemester(int semester) {
		this.semester = semester;
	}

	public String getjahrgang() {
		return jahrgang;
	}




	public void setjahrgang(String jahrgang) {
		this.jahrgang = jahrgang;
	}




	public String getsemesterverbandbezeichnung() {
		return semesterverbandbezeichnung;
	}

	public void setsemesterverbandbezeichnung(String semesterverbandbezeichnung) {
		this.semesterverbandbezeichnung = semesterverbandbezeichnung;
	}

	public int getanzahlStudenten() {
		return anzahlStudenten;
	}

	public void setanzahlStudenten(int anzahlStudenten) {
		this.anzahlStudenten = anzahlStudenten;
	}


	public String toString() {
	    return super.toString() + " " + this.studiengang + " " + this.semester + " " + this.jahrgang + " " + this.semesterverbandbezeichnung + " " + this.anzahlStudenten;
	  }
	
}
