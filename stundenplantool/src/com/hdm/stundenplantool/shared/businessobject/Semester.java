package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Semesters
 * @author: Lucas Zanella
 * @implement: Timm Roth
 */

public class Semester extends BusinessObject {
	private static final long serialVersionUID = 1L;
	
	private String semesterbezeichnung;
	private Vector<Integer> semesterverbandFremdschluesselID = new Vector<Integer>() ;
	private Vector<Integer> lehrveranstaltungFremdschluesselID = new Vector<Integer>() ;

	
	
	public Vector<Integer> getsemesterverbandFremdschluesselID() {
		return semesterverbandFremdschluesselID;
	}




	public void setsemesterverbandFremdschluesselID(
			Vector<Integer> semesterverbandFremdschluesselID) {
		this.semesterverbandFremdschluesselID = semesterverbandFremdschluesselID;
	}




	public Vector<Integer> getlehrveranstaltungFremdschluesselID() {
		return lehrveranstaltungFremdschluesselID;
	}




	public void setlehrveranstaltungFremdschluesselID(
			Vector<Integer> lehrveranstaltungFremdschluesselID) {
		this.lehrveranstaltungFremdschluesselID = lehrveranstaltungFremdschluesselID;
	}




	public String getsemesterbezeichnung() {
		return semesterbezeichnung;
	}




	public void setsemesterbezeichnung(String semesterbezeichnung) {
		this.semesterbezeichnung = semesterbezeichnung;
	}




	public String toString() {
	    return super.toString() + " " + this.semesterbezeichnung;
	  }
	
}
