package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int i=0;i<tabell.length;i++) {
			System.out.print(tabell[i] + " ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0;i<tabell.length;i++) {
			sum = sum + tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean sannhet = false;
		int i = 0;
		while (i < tabell.length) {
			if (tall == tabell[i]) {
				sannhet = true;
			} i++;
		}
		return sannhet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sannhet = true;
		for (int i = 0; i<tabell.length;i++) {
			if (tabell[i] > tabell[i+1]) {
				sannhet = false;
			}
		}
		return sannhet;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
