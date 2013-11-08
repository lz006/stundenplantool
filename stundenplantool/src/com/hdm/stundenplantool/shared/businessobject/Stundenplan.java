package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Dozenten
 * @author: Lucas Zanella
 * @implement: Lucas Zanella
 */

public class Stundenplan extends BusinessObject {
	
	public Stundenplan (int StundenplanID, String Studienhalbjahr) {
		this.StundenplanID = StundenplanID;
		this.Studienhalbjahr = Studienhalbjahr;
	}
	
	private int StundenplanID;
	private String Studienhalbjahr;
		
	
	
	public int getStundenplanID() {
		return StundenplanID;
	}
	public void setStundenplanID(int StundenplanID) {
		this.StundenplanID = StundenplanID;
	}
	public String getStudienhalbjahr() {
		return Studienhalbjahr;
	}
	public void setStudienhalbjahr(String Studienhalbjahr) {
		this.Studienhalbjahr = Studienhalbjahr;

	}
}
