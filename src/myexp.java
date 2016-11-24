public class myexp{
	
	//Richtig gelöst. Für die schnellere Variante siehe Musterlösung, die ich demnächst hochladen werde. Die Abgabe
	//nächstes mal bitte in das vorgefertigte package committen.
	
	public static double main (int x, int n) {
		double Ergebnis = 0;			//Variablennamen klein schreiben
		
		if(n<0){
			System.out.println("Geben Sie eine Zahl ein, die Grösser als 0 ist");	//größer gleich 0
		}
		else{
			for(int i=1;i<=n-1; i++){		//statt "<=n-1" lieber "<1" benutzen 
				double a = Fakultät(i);		//für die Fakultät reicht auch ein long
				double b = Math.pow(x, i);
				double c = b/a;
				Ergebnis = Ergebnis + c;
			}
			
			//wenn du ergebnis gleich am Anfang mit "1" initialisierst, kannst du dir das sparen ;)
			Ergebnis = Ergebnis + 1;	
			System.out.println(Ergebnis);
		}
		return Ergebnis;
	
	}
	private static double Fakultät (double zahl){
		double result = 1;
		for(int i=1;i<=zahl; i++){
			result = result*i;
		}
		return result;
	}
}

