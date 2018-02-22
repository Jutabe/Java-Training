class KbIn {
	public static void main(String[] args) throws Exception {
		char ch;

		System.out.print("\nWybierz znak na klawiaturze: ");
		
		ch = (char) System.in.read();
		
		System.out.println("\nWybra³eœ znak: " + ch);		
	}
}