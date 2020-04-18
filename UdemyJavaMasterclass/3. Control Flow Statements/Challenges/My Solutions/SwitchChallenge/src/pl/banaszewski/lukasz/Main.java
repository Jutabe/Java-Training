package pl.banaszewski.lukasz;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';

        switch(myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Char " + myChar + " was found");
                break;
            default:
                System.out.println("None of A, B, C, D, E chars were found");
        }
    }
}
