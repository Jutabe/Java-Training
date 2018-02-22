class Guess {
	public static void main(String[] args) throws Exception {
		char ch, ignore, answer = 'K';
		
		System.out.println("Pomyœla³em literê od A-Z. Spróbuj j¹ odgadn¹æ: ");
		System.out.println("Wpisz literê i wciœnij ENTER: ");
		
		do {			
			ch = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');	
			if(ch == answer) 
				System.out.println("Dobrze!");
			else if (ch < answer)
				System.out.println("Zbyt nisko. Spróbuj jeszcze raz: ");
			else 
				System.out.println("Zbyt wysoko. Spróbuj jeszcze raz: ");
		} while (ch != answer);
	}	
}