class IfDemo {
	public static void main(String[] args) {
		int a,b,c;
		a = 2;
		b = 3;
		
		if(a<b) System.out.println("\na jest mniejsze od b");
		
		System.out.println();
				
		c = a - b;
		System.out.println("c zawiera " + c);
		if(c >= 0) System.out.println("c jest nieujemne");
		if(c < 0) System.out.println("c jest ujemne");
		
		System.out.println();

		c = b - a;
		System.out.println("c zawiera " + c);
		if(c >= 0) System.out.println("c jest nieujemne");
		if(c < 0) System.out.println("c jest ujemne");
	
	 
	}
}