public class HelpMainMenu extends HelpFunctions{
	private boolean exitloop;
	
	public void printMainMenu() throws Exception {
		clearScreen();
		System.out.println("\n**\t JAVA SYNTAX CHEETSHEET \t**");			
		System.out.println("\n1. English");
		System.out.println("2. Polski");
		System.out.println("3. Exit program\n");	
		System.out.print("Choose your language: ");
	}
	
	public String switchMainMenu(char choice) throws Exception{
		exitloop = true;
		do {
			switch(choice) {
			case '1':
				System.out.println("\nLoading english");
				loading();
				helpInEnglish();
				return "English";
			case '2':
				System.out.println("\nWczytujê polski");
				loading();
				helpPoPolsku();
				return "Polski";
			case '3':
				System.out.println("\nProgram was terminated...");
				System.exit(0);
				return "Exit";
			default:
				System.out.println("Bad choice, try again.");
				exitloop = false;
				return "BadChoice";
			}
		} while (exitloop == false);
	}
	
	public void helpInEnglish () throws Exception {
		clearScreen();
		System.out.println("\n**\t LIST OF JAVA LANGUAGE ELEMENTS \t**");
		System.out.println("\n1. if-else ");
		System.out.println("2. switch ");
		System.out.println("3. for ");
		System.out.println("4. while ");
		System.out.println("5. do-while ");
		System.out.println("6. Exit program \n");
		System.out.print("Choose a number to view syntax: ");
	}
	
	public void helpPoPolsku () throws Exception {
		clearScreen();
		System.out.println("\n**\t LISTA ELEMENTÓW JÊZYKA JAVA \t**");
		System.out.println("\n1. if ");
		System.out.println("2. switch ");
		System.out.println("3. for ");
		System.out.println("4. while ");
		System.out.println("5. do-while ");
		System.out.println("6. WyjdŸ z programu \n");
		System.out.print("Wybierz liczbê, aby wyœwietliæ sk³adniê: ");
	}
	
	public void javaSyntaxInEnglish(char choice) throws Exception {
		do {
			exitloop = true;
			switch(choice) {
				case '1':
					System.out.println("\nLoading \"if-else\" statement");
					loading();
					clearScreen();
					System.out.println("\n**\t \"IF-ELSE\" STATEMENT \t**");
					System.out.println("\nif(condition-1) { ");
					System.out.println("   true-statement-1;");
					System.out.println("} else if(condition-2) { ");
					System.out.println("   true-statement-2;");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("} else if(condition-n) { ");
					System.out.println("   true-statement-n;");
					System.out.println("} else { ");
					System.out.println("   false-statement;");
					System.out.println("} ");
					break;
				case '2':
					System.out.println("\nLoading \"switch\" statement");
					loading();
					clearScreen();
					System.out.println("\n**\t \"SWITCH\" STATEMENT \t**");
					System.out.println("\nswitch(test-value) { ");
					System.out.println("   case value-1: ");
					System.out.println("      statements ");
					System.out.println("   case value-2: ");
					System.out.println("      statements ");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("   case value-n: ");
					System.out.println("      statements ");
					System.out.println("   default: ");
					System.out.println("      statements ");
					System.out.println("} ");
					break;
				case '3':
					System.out.println("\nLoading \"for\" statement");
					loading();
					clearScreen();
					System.out.println("\n**\t \"FOR\" STATEMENT \t**");
					System.out.println("\nfor(initialize; condition; update) { ");
					System.out.println("   statement; ");
					System.out.println("} ");
					break;
				case '4':
					System.out.println("\nLoading \"while\" statement");
					loading();
					clearScreen();
					System.out.println("\n**\t \"WHILE\" STATEMENT \t**");
					System.out.println("\nwhile(condition) { ");
					System.out.println("   statement; ");
					System.out.println("} ");
					break;
				case '5':
					System.out.println("\nLoading \"do-while\" statement");
					loading();
					clearScreen();
					System.out.println("\n**\t \"DO-WHILE\" STATEMENT \t**");
					System.out.println("\ndo { ");
					System.out.println("   statement; ");
					System.out.println("} while(condition); ");
					break;
				case '6':
					System.out.println("\nProgram was terminated by user...");
					System.exit(0);
					break;
				default:
					System.out.println("Bad choice, try again.");
					choice = setChoice();
					exitloop = false;
			} 
		} while(exitloop == false);
	}
	
	public void javaSyntaxPoPolsku(char choice) throws Exception {
		do {
			exitloop = true;
			switch(choice) {
				case '1':
					System.out.println("\nWczytujê instrukcjê \"if-else\"");
					loading();
					clearScreen();
					System.out.println("\n**\t INSTRUKCJA WARUNKOWA \"IF-ELSE\" \t**");
					System.out.println("\nif(warunek-1) { ");
					System.out.println("   instrukcja-1;");
					System.out.println("} else if(warunek-2) { ");
					System.out.println("   instrukcja-2;");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("} else if(warunek-n) { ");
					System.out.println("   instrukcja-n;");
					System.out.println("} else { ");
					System.out.println("   instrukcja;");
					System.out.println("} ");
					break;
				case '2':
					System.out.println("\nWczytujê instrukcjê \"switch\"");
					loading();
					clearScreen();
					System.out.println("\n**\t INSTRUKCJA WYBORU \"SWITCH\" \t**");
					System.out.println("\nswitch(wyra¿enie) { ");
					System.out.println("   case sta³a-1: ");
					System.out.println("      instrukcje ");
					System.out.println("   case sta³a-2: ");
					System.out.println("      instrukcje ");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("\t * ");
					System.out.println("   case sta³a-n: ");
					System.out.println("      instrukcje ");
					System.out.println("   default: ");
					System.out.println("      instrukcje ");
					System.out.println("} ");
					break;
				case '3':
					System.out.println("\nWczytujê pêtlê \"for\"");
					loading();
					clearScreen();
					System.out.println("\n**\t PÊTLA \"FOR\" \t**");
					System.out.println("\nfor(inicjalizacja; warunek; iteracja) { ");
					System.out.println("   instrukcja; ");
					System.out.println("} ");
					break;
				case '4':
					System.out.println("\nWczytujê pêtlê \"while\"");
					loading();
					clearScreen();
					System.out.println("\n**\t PÊTLA \"WHILE\" \t**");
					System.out.println("\nwhile(warunek) { ");
					System.out.println("   instrukcja; ");
					System.out.println("} ");
					break;
				case '5':
					System.out.println("\nWczytujê pêtlê \"do-while\"");
					loading();
					clearScreen();
					System.out.println("\n**\t PÊTLA \"DO-WHILE\" \t**");
					System.out.println("\ndo { ");
					System.out.println("   instrukcja; ");
					System.out.println("} while(warunek); ");
					break;
				case '6':
					System.out.println("\nU¿ytkownik wy³¹czy³ program...");
					System.exit(0);
					break;
				default:
					System.out.print("\nB³êdny wybrów, spróbuj ponownie: ");
					choice = setChoice();
					exitloop = false;
			} 
		} while(exitloop == false);
	}
}