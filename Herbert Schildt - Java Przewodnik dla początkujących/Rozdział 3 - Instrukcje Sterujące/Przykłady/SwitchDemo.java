class SwitchDemo {
	public static void main(String[] args) {
		int i;
		
		for(i = 0; i < 10; i++) {
			switch(i) {
				case 0:
					System.out.println("i jest r�wne zero");
					break;
				case 1:
					System.out.println("i jest r�wne jeden");
					break;
				case 2:
					System.out.println("i jest r�wne dwa");
					break;
				case 3:
					System.out.println("i jest r�wne trzy");
					break;
				case 4:
					System.out.println("i jest r�wne cztery");
					break;
				default:
					System.out.println("i jest r�wne 5 lub wi�cej");
					break;
			}
			
		}
		
		
	}
	
	
}