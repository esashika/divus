/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaAgencia {

	public static void main(String[] args) {

		Agencia a = new Agencia();
		a.numero = "abc123";
		a.banco = 123;

		a.imprimeDados();

		a.inicializaAgencia("def1234", 456);
		a.imprimeDados();
		
		//teste teste

		// Criacao da agencia
		// Inicializacao da agencia
		// Impressao dos dados da agencia
	}
}
