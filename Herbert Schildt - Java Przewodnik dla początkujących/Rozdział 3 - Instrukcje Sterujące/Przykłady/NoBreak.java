class NoBreak {
	public static void main(String[] args) {
		int i;
		
		for(i = 0; i <= 5; i++) {
			switch(i) {
				case 0:
					System.out.println("i jest mniejsze od zero");
					
				case 1:
					System.out.println("i jest mniejsze od jeden");
					
				case 2:
					System.out.println("i jest mniejsze od dwa");
					
				case 3:
					System.out.println("i jest mniejsze od trzy");
					
				case 4:
					System.out.println("i jest mniejsze od cztery");
					
				default:
					System.out.println("i jest mniejsze od piêciu");
					
			}
			
			System.out.println();
			
		}
	}
	
	
}