public class ControleFluxoWhileOpcional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int limiteInferior = 14;
		int limiteSuperior = 1578;
		int numerosDiv6 = 0;

		for (int i = limiteInferior; i < limiteSuperior; i++) {

			if (i % 6 == 0) {
				numerosDiv6++;
				System.out.println(numerosDiv6 + " - " + i);
			}
		}

		String texto = "Quantidade de numeros divisiveis por 6 entre ";
		System.out.println(texto + limiteInferior + " e " + limiteSuperior
				+ " e : " + numerosDiv6);
	
	
	
	}

}
