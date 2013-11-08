package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Semesterverbands
 * @author: Lucas Zanella
 * @implement: Mathias Zimmermann
 */
public class Semesterverband {
	public Semesterverband (int SemesterverbandID, String Semesterverbandbezeichnung, String Studiengang, int AnzahlStudenten, String Jahrgang) {
		this.SemesterverbandID = SemesterverbandID;
		this.Semesterverbandbezeichnung = Semesterverbandbezeichnung;
		this.Studiengang = Studiengang;
		this.AnzahlStudenten = AnzahlStudenten;
		this.Jahrgang = Jahrgang;

	}
	
	private int SemesterverbandID;
	private String Semesterverbandbezeichnung;
	private String Studiengang;
	private String Jahrgang;
	private int AnzahlStudenten;
	
	
	
	public int getSemesterverbandID() {
		return SemesterverbandID;
	}
	public void setSemesterverbandID(int SemesterverbandID) {
		this.SemesterverbandID = SemesterverbandID;
	}
	public String getSemesterverbandbezeichnung() {
		return Semesterverbandbezeichnung;
	}
	public void setSemesterverbandbezeichnung(String Semesterverbandbezeichnung) {
		this.Semesterverbandbezeichnung = Semesterverbandbezeichnung;
	}
	public String getStudiengang() {
		return Studiengang;
	}
	public void setStudiengang(String Studiengang) {
		this.Studiengang = Studiengang;
	}
	public String getJahrgang() {
		return Jahrgang;
	}
	public void setJahrgang(String Jahrgang) {
		this.Jahrgang = Jahrgang;
	}	
	public int getAnzahlStudenten() {
		return AnzahlStudenten;
	}
	public void setStudiengang(int AnzahlStudenten) {
		this.AnzahlStudenten = AnzahlStudenten;
	}
}
