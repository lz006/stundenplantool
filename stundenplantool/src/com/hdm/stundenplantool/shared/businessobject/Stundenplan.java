package com.hdm.stundenplantool.shared.businessobject;

/*Ein Objekt dieser Klasse ist eine Repräsentation eines realen Stundenplans
 * @author: Lucas Zanella
 * @implement: Timm Roth
 */

public class Stundenplan extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	
	private String studienhalbjahr;
	

	
	public String getStudienhalbjahr() {
		return studienhalbjahr;
	}



	public void setStudienhalbjahr(String studienhalbjahr) {
		this.studienhalbjahr = studienhalbjahr;
	}



	public String toString() {
	    return super.toString() + " " + this.studienhalbjahr;
	  }
	
}
