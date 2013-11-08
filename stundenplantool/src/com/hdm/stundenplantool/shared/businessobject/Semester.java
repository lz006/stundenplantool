package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Dozenten
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 */

public class Semester extends BusinessObject {
	
	public Semester (int SemesterID, String Semesterbezeichnung) {
		this.SemesterID = SemesterID;
		this.Semesterbezeichnung = Semesterbezeichnung;
	}
	
	private int SemesterID;
	private String Semesterbezeichnung;
		
	
	
	public int getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID (int SemesterID) {
		this.SemesterID = SemesterID;
	}
	public String getSemesterbezeichnung() {
		return Semesterbezeichnung;
	}
	public void setSemesterbezeichnung (String Semesterbezeichnung) {
		this.Semesterbezeichnung = Semesterbezeichnung;

	}
}
