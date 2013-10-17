public class ControleFluxoForOpcional {

	// Desenvolvido por rhedson esashika
	// rhedson.esashika@tjam.jus.br

	public static void main(String[] args) {

		/*
		 * for (int i = 100; i < 200; i++) { if (i % 2 == 0) {
		 * System.out.println(i + " Ž divis’vel por 2");
		 * 
		 * if (i % 3 == 0) { System.out.println(i + " Ž divis’vel por 3"); }
		 * 
		 * if (i % 2 == 0 && i % 3 == 0) { System.out.println(i +
		 * " Ž divis’vel por 2 e 3 portanto tambem por 6"); }
		 * System.out.println("--------------"); }
		 * 
		 * }
		 */
		int countNumeroDiv2 = 0;

		// int vetorCountNumeroDiv2[] = new int[countNumeroDiv2];

		for (int i = 100; i < 200; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " Ž divis’vel por 2");
				countNumeroDiv2++;
				

				if (i % 3 == 0) {
					System.out.print(", por 3");
				}

				if (i % 2 == 0 && i % 3 == 0) {
					System.out.print(" e tambŽm por 6");
				}
				System.out.println("\n--------------");

			}

		}// serao impressos fora do for

		System.out.println("Numero Divis’veis por 2 = " + countNumeroDiv2);
	}
}