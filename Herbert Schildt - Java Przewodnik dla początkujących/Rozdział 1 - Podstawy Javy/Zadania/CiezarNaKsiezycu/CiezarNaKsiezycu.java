class CiezarNaKsiezycu {
	public static void main (String[] args) {
	/** Grawitacja Ksi�zyca stanowi oko�o 17% ziemskiej.
	Napisz program, ktory obliczy Tw�j ci�ar na Ksi�ycu. **/	

	double w, g = 0.17d, wk ;

	w = 76.9d;
	wk = w * g;

	System.out.println("\nMoja waga na kuli ziemskiej: " + w);
	System.out.print("Moja waga na ksi�zycu: ");
	System.out.format("%.4f", wk);
	
	}

}