class Guess {
	public static void main(String[] args) throws Exception {
		char ch, ignore, answer = 'K';
		
		System.out.println("Pomy�la�em liter� od A-Z. Spr�buj j� odgadn��: ");
		System.out.println("Wpisz liter� i wci�nij ENTER: ");
		
		do {			
			ch = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');	
			if(ch == answer) 
				System.out.println("Dobrze!");
			else if (ch < answer)
				System.out.println("Zbyt nisko. Spr�buj jeszcze raz: ");
			else 
				System.out.println("Zbyt wysoko. Spr�buj jeszcze raz: ");
		} while (ch != answer);
	}	
}