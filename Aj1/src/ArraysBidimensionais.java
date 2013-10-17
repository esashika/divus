public class ArraysBidimensionais {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
		
		for (int[] referenciaVetor : array) {
			System.out.println(referenciaVetor);
			
			for (int i : referenciaVetor) {
				System.out.println(i);
			}
		}

	}

}
