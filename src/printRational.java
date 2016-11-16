public class printRational {
	public static void main(String[] args){
		
		double ergebnis;
			
		Rational zähler = new Rational();
		Rational nenner = new Rational();
	
		ergebnis = zähler.whatZähler() / nenner.whatNenner();
		
		System.out.println("Ergebnis " + ergebnis );
	}
}
