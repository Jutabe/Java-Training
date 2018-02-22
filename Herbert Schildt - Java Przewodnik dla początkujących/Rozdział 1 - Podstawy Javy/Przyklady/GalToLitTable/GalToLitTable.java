class GalToLitTable {
	public static void main(String[] args) {
		// program ma wypisywaæ 30 wierszy kolejnych konwersji galonów na litry

		double liters;
		int gallons, counter = 1;
		
		System.out.println();		

		for(gallons = 1; gallons <= 30; gallons++) {
			liters = gallons * 3.7854;
			if(gallons == 1) {
				System.out.print(gallons + " galon to ");
				System.out.format("%.4f", liters);
				System.out.println(" litrów.");
			} else if(gallons >= 2 && gallons < 5) {
				System.out.print(gallons + " galony to ");
				System.out.format("%.4f", liters);
				System.out.println(" litrów.");

			} else {
				System.out.print(gallons + " galonów to ");
				System.out.format("%.4f", liters);
				System.out.println(" litrów.");
			
				if(counter == 10) {
					System.out.println();
					counter = 0;
				}
			}
			counter++;
		}
		
	}

}