package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int i = 0;i<matrise.length;i++) {
			int[] kolonner = matrise[i];
			for(int j = 0;j<kolonner.length;j++) {
				System.out.print(kolonner[j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for(int i = 0;i<matrise.length;i++) {
			int[] kolonner = matrise[i];
			for(int j = 0;j<kolonner.length;j++) {
				streng += kolonner[j] + " ";
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] m = new int[matrise.length][];
		for(int i = 0; i<matrise.length;i++) {
			m[i] = new int[matrise[i].length];
			for(int j = 0; j<matrise[i].length;j++) {
				m[i][j] = matrise[i][j] * tall;
			}
		}
		return m;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean sannhet = true;
		if (a.length != b.length) {
			return sannhet = false;
		}
		for (int i = 0; i<a.length;i++) {
			int[] kolonner1 = a[i];
			int[] kolonner2 = b[i];
			if (kolonner1.length != kolonner2.length) {
				return sannhet = false;
			}
			for(int j = 0; j<kolonner1.length;j++) {
				int tall1 = kolonner1[j];
				int tall2 = kolonner2[j];
				if (tall1 != tall2) {
					return sannhet = false;
				}
			}
		}
		return sannhet;
		
	}
	
//	// e)
//	public static int[][] speile(int[][] matrise) {
//
//		// TODO
//
//		throw new UnsupportedOperationException("Metoden speile ikke implementert");
//	
//	}
//
//	// f)
//	public static int[][] multipliser(int[][] a, int[][] b) {
//
//		// TODO
//		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
//	
//	}
}
