class Hipot {
	public static void main (String[] args) {
		/** Stosuje twierdzenie Pitagorasa
		do obliczenia przeciwprostok¹tnej
		znaj¹c d³ugoœæ przyprostok¹tnych **/
		
		double a, b, c;
		
		a = 3;
		b = 4;
		c = Math.sqrt(a*a + b*b); // a*a + b*b = c*c => c = pierwiastek z (a*a + b*b)
		
		System.out.println("\nPrzeciwprostok¹tna trójk¹ta wynosi " + c + ".");
		
	}
}