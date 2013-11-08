package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation einer realen Belegung
 * @author: Lucas Zanella
 * @implement: Timm Roth
 */

public class Belegung extends BusinessObject {
	
	public Belegung (int BelegungID) {
		this.BelegungID = BelegungID;
		
	}
	
	private int BelegungID;
		
	
	public int getBelegungID() {
		return BelegungID;
	}
	public void setBelegungID(int BelegungID) {
		this.BelegungID = BelegungID;
	}
	

}
