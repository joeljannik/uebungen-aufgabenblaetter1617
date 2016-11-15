public class myexp{
	public static double main (int x, int n) {
		double Ergebnis = 0;
		
		if(n<1){
			System.out.println("Geben Sie eine Zahl ein die Grösser als 1 ist");
		}
		else{
			for(int i=1;i<=n-1; i++){
				double a = Fakultät(i);
				double b = Math.pow(x, i);
				double c = b/a;
				Ergebnis = Ergebnis + c;
			}
			
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

