package Hausaufgabe_3;

class Rational {

	private static double zähler;
	private static double nenner;
	
	Rational(){
		this.zähler = 0;
		this.nenner = 1;	
	}
	
	double setZähler(double x){
		return this.zähler = x;
	}
	double setNenner(double y){
		 return this.nenner = y;
	}
	double getZähler(){
		return zähler;
	}
	
	double getNenner(){
		return nenner;
	}
	
	double negate(double ergebnis){
		double ergebnisNegate;
		return ergebnisNegate = ergebnis * -1;
	}
	
	double invert(double zähler, double nenner){
		double ergebnisInvert;
		return ergebnisInvert = nenner / zähler;
	}
	
	double add(double rational_1, double ergebnis ){
		double ergebnisAdd;
		return ergebnisAdd = rational_1 + ergebnis;
	}
	
}
