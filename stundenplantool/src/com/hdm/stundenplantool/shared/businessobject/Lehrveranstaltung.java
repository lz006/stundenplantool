package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation einer realen Lehrveranstaltung
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 */

public class Lehrveranstaltung extends BusinessObject {

	public Lehrveranstaltung (int LehrveranstaltungID, int Lehrveranstaltungsumfang, String Lehrveranstaltungsbezeichnung) {
		this.LehrveranstaltungID = LehrveranstaltungID;
		this.Lehrveranstaltungsumfang = Lehrveranstaltungsumfang;
		this.Lehrveranstaltungsbezeichnung = Lehrveranstaltungsbezeichnung;
	}
	
	private int LehrveranstaltungID;
	private int Lehrveranstaltungsumfang;
	private String Lehrveranstaltungsbezeichnung;
	
	
	
	public int getLehrveranstaltungID() {
		return LehrveranstaltungID;
	}
	public void setLehrveranstaltungID(int LehrveranstaltungID) {
		this.LehrveranstaltungID = LehrveranstaltungID;
	}
	public int getLehrveranstaltungsumfang() {
		return Lehrveranstaltungsumfang;
	}
	public void setLehrveranstaltungsumfang(int Lehrveranstaltungsumfang) {
		this.Lehrveranstaltungsumfang = Lehrveranstaltungsumfang;
	}
	public String getLehrveranstaltungsbezeichnung() {
		return Lehrveranstaltungsbezeichnung;
	}
	public void setLehrveranstaltungsbezeichnung(String Lehrveranstaltungsbezeichnung) {
		this.Lehrveranstaltungsbezeichnung = Lehrveranstaltungsbezeichnung;
	}
	}
