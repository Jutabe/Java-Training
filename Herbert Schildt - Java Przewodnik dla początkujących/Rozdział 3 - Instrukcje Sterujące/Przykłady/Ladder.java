class Ladder {
	public static void main (String[] args) {
		int x;
		
		for (x = 0; x < 6; x++) {
			if (x == 0)
				System.out.println("x równa siê jeden");
			else if (x == 1)
				System.out.println("x równa siê dwa");
			else if (x == 2)
				System.out.println("x równa siê trzy");
			else if (x == 3)
				System.out.println("x równa sie cztery");
			else
				System.out.println("x nie nale¿y do przedzia³u od 1 do 4");
		}
	}
}