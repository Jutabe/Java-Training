class LogicalOpTable {
	public static void main(String[] args) {
		boolean p, q, k, l;
		
		p = true; q = false; k = false; l = false;
		System.out.println("\nP\tQ\tK\tL\t&\t|\t&&\t||\t^");
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = true; q = true; k = false; l = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = true; q = true; k = true; l = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = true; q = true; k = true; l = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = false; q = false; k = false; l = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = false; q = true; k = false; l = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = false; q = true; k = true; l = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
		p = false; q = false; k = false; l = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print(k + "\t" + l + "\t");
		System.out.print((p&q&k&l) + "\t" + (p|q|k|l) + "\t");
		System.out.print((p&&q&&k&&l) + "\t" + (p||q||k||l) + "\t");
		System.out.println((p^q^k^l));
		
	}
	
}