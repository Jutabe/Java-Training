class LiczbyPierwsze {
	public static void main(String[] args) {
		/** Napisz program wyszukuj¹cy wszystkie liczby pierwsze z przedzia³u od 2 do 100 **/
		
		// 1 Sposób: 2,3,5,7 -> na podstawie wiedzy z rozdzia³u 2.
		
		System.out.println("\nWszystkie liczby pierwsze od 2 do 100: ");
		System.out.println("Sposób 1 - prymitywny");

		
		for(int i = 2; i <= 100; i++) {
			if((i == 2) | (i == 3) | (i == 5) | (i == 7)) {
				System.out.print(i + ", ");
			} 
			if((i % 2 != 0) & (i % 3 != 0) & (i % 5 != 0) & (i % 7 != 0)){
				System.out.print(i + ", ");
			}
		}
		
		System.out.println();
		
		// 2 Sposób na dwie pêtle for:
		System.out.println("\nSposób 2 - na dwie pêtle for");
		int i, j;
		boolean isprime;
		
		for(i = 2; i <= 100; i++) {
			isprime = true;
			for(j = 2; j <= i/j; j++) {
				if((i%j) == 0) isprime = false;
			}
			if(isprime) System.out.print(i + ", ");
		}
		
		System.out.println();
		
		
	}
	
}