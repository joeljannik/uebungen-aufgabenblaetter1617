package Hausaufgabe_3;

//Schade. Leider scheinst du das Konzept von Objekten noch nicht ganz verstanden zu haben. Dir fehlt außerdem eine
//ausführbare main-Methode um deinen Code zu testen. Bitte sieh dir die Musterlösung an, die ich demnächst in das
//repository laden werde.
//Falls du Fragen hast, kannst du dich jederzeit melden.

class Rational {

	private static double zähler;		//an dieser Stelle auf gar keinen Fall static nehmen!!
	private static double nenner;		//die beiden Variablen sollen für jedes erstellte Objekt einen eigenen Wert besitzen.
						//Wenn du statische Variablen nimmst, änderst du immer die Variablen für alle Objekte 
						//Vom Typ Rational. Da hier gebrochene Zahlen in Bruchschreibweise dargestellt werden
						//sollen reichen auch integer-Ganzzahlen (also int zähler, int nenner).
						//Private ist aber richtig :)
	
	Rational(){				//Den Konstruktor ruhig auf public setzen.
		this.zähler = 0;		//Richtig. Funktioniert aber aufgrund der statischen Deklaration der
		this.nenner = 1;		//Variablen nicht so gut (s.o.)
	}
	
	//Eine _set_ Methode soll ein Objektfeld auf eine bestimmte Variable setzen. Set-Methoden haben i.d.R. _keinen_ Rückgabetyp
	//Nach Aufruf dieser Methode wurde deine variable nicht geändert!
	double setZähler(double x){		
		return this.zähler = x;	
		//richtig wäre:
		//this.zähler = x;
	}
	
	//s.o.
	double setNenner(double y){
		 return this.nenner = y;
	}
	
	//War nicht gefordert, aber grundsätzlich richtig.
	double getZähler(){
		return zähler;
	}
	
	double getNenner(){
		return nenner;
	}
	
	//Die negate Funktion soll laut Aufgabenstellung _nichts_ zurückgeben (also void benutzen!).
	//Sie soll das Objekt nur ändern. Außerdem soll immer die Variable des aktuellen Objekts geändert
	//werden. Daher benötigst du auch kein ergebnis-Paramter, den du übergibst.
	double negate(double ergebnis){
		double ergebnisNegate;
		return ergebnisNegate = ergebnis * -1;
	}
	
	//siehe Kommentar zu negate. 
	double invert(double zähler, double nenner){
		double ergebnisInvert;
		return ergebnisInvert = nenner / zähler;
	}
	
	//siehe Kommentar zu negate.
	double add(double rational_1, double ergebnis ){
		double ergebnisAdd;
		return ergebnisAdd = rational_1 + ergebnis;
	}
	
}
