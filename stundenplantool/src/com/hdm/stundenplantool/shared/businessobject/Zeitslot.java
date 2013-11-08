package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Dozenten
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 * @implement: Timm Roth
 */

public class Zeitslot extends BusinessObject {
	
	public Zeitslot (int ZeitslotID, int Zeitslotanfangszeit, int Zeitslotendzeit) {
		this.ZeitslotID = ZeitslotID;
		this.Zeitslotanfangszeit = Zeitslotanfangszeit;
		this.Zeitslotendzeit = Zeitslotendzeit;
	}
	
	private int ZeitslotID;
	private int Zeitslotanfangszeit;
	private int Zeitslotendzeit;
	
	
	
	public int getZeitslotID() {
		return ZeitslotID;
	}
	public void setZeitslotID(int ZeitslotID) {
		this.ZeitslotID = ZeitslotID;
	}
	public int getZeitslotanfangszeit() {
		return Zeitslotanfangszeit;
	}
	public void setZeitslotanfangszeit(int Zeitslotanfangszeit ) {
		this.Zeitslotanfangszeit = Zeitslotanfangszeit;
	}
	public int getZeitslotendzeit() {
		return Zeitslotendzeit;
	}
	public void setZeitslotendzeit(int Zeitslotendzeit) {
		this.Zeitslotendzeit = Zeitslotendzeit;
	}
	
	

}
