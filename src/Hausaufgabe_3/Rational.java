package Hausaufgabe_3;

class Rational {

	private static double z�hler;
	private static double nenner;
	
	Rational(){
		this.z�hler = 0;
		this.nenner = 1;	
	}
	
	double setZ�hler(double x){
		return this.z�hler = x;
	}
	double setNenner(double y){
		 return this.nenner = y;
	}
	double getZ�hler(){
		return z�hler;
	}
	
	double getNenner(){
		return nenner;
	}
	
	double negate(double ergebnis){
		double ergebnisNegate;
		return ergebnisNegate = ergebnis * -1;
	}
	
	double invert(double z�hler, double nenner){
		double ergebnisInvert;
		return ergebnisInvert = nenner / z�hler;
	}
	
	double add(double rational_1, double ergebnis ){
		double ergebnisAdd;
		return ergebnisAdd = rational_1 + ergebnis;
	}
	
}
