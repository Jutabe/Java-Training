public class HelpFunctions extends Help{
	private char choice, ignore;
	
	public char setChoice() throws Exception {
		choice = (char) System.in.read();
		Thread.sleep(1000);
		do {
			ignore = (char) System.in.read();
		} while (ignore != '\n');
		Character.toLowerCase(choice);
		return choice;
	}

	public void loading() throws Exception {
		System.out.print("[");
		for (int z = 0; z <= 25; z++) {
			Thread.sleep(100);
			System.out.print("*");
		}
		System.out.print("]");
	}
		
	public void clearScreen() throws Exception, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
	
	public void backOrExit(String language) throws Exception{
		if(language == "English") {
			System.out.print("\nPress (B) to go back or Press (E) to exit the program: ");
		} else {
			System.out.print("\nNaciśnij (B), aby wrócić lub naciśnij (E), aby wyjść z programu: ");
		}
		
		switch(setChoice()) {
			case 'b':
				System.out.println("B was pressed");
				break;
			case 'e':
				System.out.println("\nProgram was terminated...");
				System.exit(0);
				break;
			default:
				System.out.println(setChoice());
		}	
	}
}