class CiezarNaKsiezycu {
	public static void main (String[] args) {
	/** Grawitacja Ksiêzyca stanowi oko³o 17% ziemskiej.
	Napisz program, ktory obliczy Twój ciê¿ar na Ksiê¿ycu. **/	

	double w, g = 0.17d, wk ;

	w = 76.9d;
	wk = w * g;

	System.out.println("\nMoja waga na kuli ziemskiej: " + w);
	System.out.print("Moja waga na ksiêzycu: ");
	System.out.format("%.4f", wk);
	
	}

}