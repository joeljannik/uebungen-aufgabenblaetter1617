class printRational {
	public static void main(String[] args){
		
		double x = 7; 
		//Zähler
		
		double y = 8;
		//Nenner
		
		double z = 0.5;
		//Argument
		
		double ergebnis;
		double ergebnisNegate;
		double ergebnisInvert;
		double ergebnisAdd;
		
		Rational rational = new Rational();
		rational.setZähler(x);
		rational.setNenner(y);
		
		ergebnis = rational.getZähler() / rational.getNenner();
		ergebnisNegate = rational.negate(ergebnis);
		ergebnisInvert = rational.invert(x, y);
		ergebnisAdd = rational.add(z, ergebnis);
		
		System.out.println("Ergebnis " + ergebnis );
	    System.out.println("ErgebnisNegate " + ergebnisNegate);
	    System.out.println("ErgebnisInvert " + ergebnisInvert);
	    System.out.println("ErgebnisAdd " + ergebnisAdd);
	}
}
