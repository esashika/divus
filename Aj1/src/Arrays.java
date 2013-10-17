public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = new String[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = ("Cliente" + i + " Email: Cliente" + i + "@cliente.com.br");
		}

		for (String vetorArray : array) {// metodo enhanced for vetor array Ž
											// vari‡vel local do escopo
			System.out.println(vetorArray);
		}

	}

}
