package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Semesterverbands
 * @author: Lucas Zanella
 * @implement: Mathias Zimmermann
 */
public class Semesterverband {
	public Semesterverband (int SemesterverbandID, String Semesterverbandsbezeichnung, String Studiengang, int AnzahlStudenten, String Jahrgang) {
		this.SemesterverbandID = SemesterverbandID;
		this.Semesterverbandsbezeichnung = Semesterverbandsbezeichnung;
		this.Studiengang = Studiengang;
		this.AnzahlStudenten = AnzahlStudenten;
		this.Jahrgang = Jahrgang;

	}
	
	private int SemesterverbandID;
	private String Semesterverbandsbezeichnung;
	private String Studiengang;
	private String Jahrgang;
	private int AnzahlStudenten;
	
	
	
	public int getSemesterverbandID() {
		return SemesterverbandID;
	}
	public void setSemesterverbandID(int SemesterverbandID) {
		this.SemesterverbandID = SemesterverbandID;
	}
	public String getSemesterverbandsbezeichnung() {
		return Semesterverbandsbezeichnung;
	}
	public void setSemesterverbandbezeichnung(String Semesterverbandsbezeichnung) {
		this.Semesterverbandsbezeichnung = Semesterverbandsbezeichnung;
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
