class Hipot {
	public static void main (String[] args) {
		/** Stosuje twierdzenie Pitagorasa
		do obliczenia przeciwprostok�tnej
		znaj�c d�ugo�� przyprostok�tnych **/
		
		double a, b, c;
		
		a = 3;
		b = 4;
		c = Math.sqrt(a*a + b*b); // a*a + b*b = c*c => c = pierwiastek z (a*a + b*b)
		
		System.out.println("\nPrzeciwprostok�tna tr�jk�ta wynosi " + c + ".");
		
	}
}