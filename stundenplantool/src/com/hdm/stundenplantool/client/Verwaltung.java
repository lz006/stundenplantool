package com.hdm.stundenplantool.client;
import com.hdm.stundenplantool.shared.businessobject.Studiengang;
import com.hdm.stundenplantool.shared.businessobject.Stundenplan;
import java.util.Vector;
import com.hdm.stundenplantool.shared.businessobject.Belegung;
import com.hdm.stundenplantool.shared.businessobject.Zeitslot;
import com.hdm.stundenplantool.shared.businessobject.Lehrveranstaltung;
import com.hdm.stundenplantool.shared.businessobject.Raum;
import com.hdm.stundenplantool.shared.businessobject.Dozent;
import com.hdm.stundenplantool.shared.businessobject.Semesterverband;

public interface Verwaltung {
public Semesterverband aendernSemesterverband(Semesterverband semesterverband)throws IllegalArgumentException;
   
   public Dozent anlegenDozent(Dozent dozent)throws IllegalArgumentException;
   
   public void loeschenDozent(Dozent dozent)throws IllegalArgumentException;
   
   public Dozent aendernDozent(Dozent dozent)throws IllegalArgumentException;
   
   public Raum anlegenRaum(Raum raum)throws IllegalArgumentException;
   
   public void loeschenRaum(Raum raum)throws IllegalArgumentException;
   
   public Raum aendernRaum(Raum raum)throws IllegalArgumentException;
   
   public Semesterverband anlegenSemesterverband(Semesterverband semesterverband)throws IllegalArgumentException;
   
   public void loeschenSemesterverband(Semesterverband semesterverband)throws IllegalArgumentException;
   
   public Lehrveranstaltung anlegenLehrveranstaltung(Lehrveranstaltung lehrveranstaltung)throws IllegalArgumentException;
   
   public Lehrveranstaltung aendernLehrveranstaltung(Lehrveranstaltung lehrveranstaltung)throws IllegalArgumentException;
   
   public void loeschenLehrveranstaltung(Lehrveranstaltung lehrveranstaltung)throws IllegalArgumentException;
   
   public Zeitslot anlegenZeitslot(Zeitslot zeitslot)throws IllegalArgumentException;
   
   public Zeitslot aendernZeitslot(Zeitslot zeitslot)throws IllegalArgumentException;
   
   public void loeschenZeitslot(Zeitslot zeitslot)throws IllegalArgumentException;
   
   public Belegung anlegenBelegung(Belegung belegung)throws IllegalArgumentException;
   
   public Belegung aendernBelegung(Belegung belegung)throws IllegalArgumentException;
   
   public void loeschenBelegung(Belegung belegung)throws IllegalArgumentException;
   
   public Vector <Dozent> auslesenAlleDozent()throws IllegalArgumentException;
   
   public Vector <Raum> auslesenAlleRaum()throws IllegalArgumentException;
   
   public Vector <Semesterverband> auslesenAlleSemesterverband()throws IllegalArgumentException;
   
   public Vector <Semesterverband> auslesenAlleZeitslot()throws IllegalArgumentException;
   
   public Vector <Semesterverband> auslesenAlleStudiengang()throws IllegalArgumentException;
   
   public Vector <Semesterverband> auslesenAlleLehrveranstaltung()throws IllegalArgumentException;
   
   public Vector <Semesterverband> auslesenAlleSemester()throws IllegalArgumentException;
   
   public Vector <Semesterverband> auslesenAlleBelegung()throws IllegalArgumentException;
   
   public Dozent auslesenDozent(int key)throws IllegalArgumentException;
   
   public Raum auslesenRaum(int key)throws IllegalArgumentException;
   
   public Semesterverband auslesenSemesterverband(int key)throws IllegalArgumentException;
   
   public Zeitslot auslesenZeitslot(int key)throws IllegalArgumentException;
   
   public Lehrveranstaltung auslesenLehrveranstaltung(int key)throws IllegalArgumentException;
   
   public Stundenplan auslesenStundenplan(int key)throws IllegalArgumentException;
   
   public Studiengang auslesenStudiengang(int key)throws IllegalArgumentException;
   
   

	
}
