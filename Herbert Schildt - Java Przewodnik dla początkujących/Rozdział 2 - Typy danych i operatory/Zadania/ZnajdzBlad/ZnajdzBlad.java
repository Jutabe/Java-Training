class ZnajdzBlad {
	public static void main(String[] args) {
		/** Gdzie tkwi b³¹d w poni¿szym fragmencie kodu?
		for(i = 0; i < 10; i++) {
			int sum;
			
			sum = sum + i;
		}
		System.out.println("Suma: " + sum); **/
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		
		System.out.println("Suma: " + sum);	
	}
	
	
}