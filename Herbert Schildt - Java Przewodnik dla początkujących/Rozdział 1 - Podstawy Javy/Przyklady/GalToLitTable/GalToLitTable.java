class GalToLitTable {
	public static void main(String[] args) {
		// program ma wypisywa� 30 wierszy kolejnych konwersji galon�w na litry

		double liters;
		int gallons, counter = 1;
		
		System.out.println();		

		for(gallons = 1; gallons <= 30; gallons++) {
			liters = gallons * 3.7854;
			if(gallons == 1) {
				System.out.print(gallons + " galon to ");
				System.out.format("%.4f", liters);
				System.out.println(" litr�w.");
			} else if(gallons >= 2 && gallons < 5) {
				System.out.print(gallons + " galony to ");
				System.out.format("%.4f", liters);
				System.out.println(" litr�w.");

			} else {
				System.out.print(gallons + " galon�w to ");
				System.out.format("%.4f", liters);
				System.out.println(" litr�w.");
			
				if(counter == 10) {
					System.out.println();
					counter = 0;
				}
			}
			counter++;
		}
		
	}

}