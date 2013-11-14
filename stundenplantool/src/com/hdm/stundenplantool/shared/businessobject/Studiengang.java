package com.hdm.stundenplantool.shared.businessobject;

import java.util.Vector;

public class Studiengang extends BusinessObject{

	/*public Dozent (int dozentID, String vorname, String nachname) {
	super.setId(dozentID);
	this.vorname = vorname;
	this.nachname = nachname;
}
*/

private static final long serialVersionUID = 1L;

private int semsterverbandID;
private int studiengangID;
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



public int getsemsterverbandID() {
	return semsterverbandID;
}



public void setsemsterverbandID(int semsterverbandID) {
	this.semsterverbandID = semsterverbandID;
}



public int getstudiengangID() {
	return studiengangID;
}



public void setstudiengangID(int studiengangID) {
	this.studiengangID = studiengangID;
}



public String toString() {
    return super.toString() + " " + this.semsterverbandID + " " + this.studiengangID;
  }


	
}
