class SwitchDemo {
	public static void main(String[] args) {
		int i;
		
		for(i = 0; i < 10; i++) {
			switch(i) {
				case 0:
					System.out.println("i jest równe zero");
					break;
				case 1:
					System.out.println("i jest równe jeden");
					break;
				case 2:
					System.out.println("i jest równe dwa");
					break;
				case 3:
					System.out.println("i jest równe trzy");
					break;
				case 4:
					System.out.println("i jest równe cztery");
					break;
				default:
					System.out.println("i jest równe 5 lub wiêcej");
					break;
			}
			
		}
		
		
	}
	
	
}