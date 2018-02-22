class Help {
	public static void main(String[] args) throws Exception{
		boolean repeat = true;
		
		HelpMainMenu newMainMenu = new HelpMainMenu();
		HelpFunctions menuFunctions = new HelpFunctions();
				
		do {
			newMainMenu.printMainMenu();
			String language = newMainMenu.switchMainMenu(menuFunctions.setChoice());
			
			if(language == "English") {
				newMainMenu.javaSyntaxInEnglish(menuFunctions.setChoice());
				newMainMenu.backOrExit(language);
			} else if(language == "Polski") {
				newMainMenu.javaSyntaxPoPolsku(menuFunctions.setChoice());
				newMainMenu.backOrExit(language);
			} else {
				System.out.println("Error has occurred");
				System.out.println("Moving back to main menu screen");
			}
		} while(repeat == true);
	}		
}