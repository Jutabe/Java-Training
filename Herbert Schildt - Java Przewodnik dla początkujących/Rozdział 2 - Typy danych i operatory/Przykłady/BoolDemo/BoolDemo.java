class BoolDemo {
	public static void main(String[] args) {
		boolean b;
		
		System.out.println("\nDeklaracja kolejno b = false i b = true: ");
		b = false;
		System.out.println("b jest " + b);
		b = true;
		System.out.println("b jest " + b);
		
		System.out.println("\nBoolean jako zmienna steruj�ca p�tli warunkowej 'if': ");
		if(b) System.out.println("To wywo�anie zosta�o wykonane");
		b = false;
		if(b) System.out.println("To wywo�ani nie zosta�o wykonane");
		
		System.out.println("\nBoolean jako wynik dzia�ania: ");
		System.out.println("10 < 9? => " + (10 < 9));
		System.out.println("10 > 9? => " + (10 > 9));
	}
}