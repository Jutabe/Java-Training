class InchToMetersTable {
	public static void main(String[] args) {
		/** Zaadoptuj program przedstawiony na listingu 1.8., aby wy�wietla� tabel� konwersji cali na metry. 
		Wy�wietl j� dla 12 st�p, cal po calu. Umie�� pusty wiersz co 12 cali.
		(Jeden metr r�wna si� w przybli�eniu 39,37 cala) **/
		
		double meters, foots;
		int inches = 1, counter = 1;
		
		foots = inches / 12;
		
		for(inches = 1; foots < 12; inches++) {
			meters = inches / 39.37;
			foots = inches / 12;
			if(inches == 1) {
				System.out.print("\n" + inches + " cal to ");
				System.out.format("%.4f", meters);
				System.out.println(" metr�w.");
			} else if(inches < 5) {
				System.out.print("\n" + inches + " cale to ");
				System.out.format("%.4f", meters);
				System.out.println(" metr�w.");
			} else {
				System.out.print("\n" + inches + " cali to ");
				System.out.format("%.4f", meters);
				System.out.println(" metr�w.");
			}
			
			if(counter == 12) {
				System.out.println();
				counter = 1;
			}
			
			counter++;
		}
		
		System.out.println("\nWykona�em obliczenia dla " + (int) foots + " st�p.");
		
	}
	
}