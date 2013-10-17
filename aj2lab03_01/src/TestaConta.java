/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

	public static void main(String[] args) {
		// Criar um objeto do tipo Conta
		Conta testaConta = new Conta();
		// Usar o metodo inicializaConta para fazer a inicializacao do objeto
		// criado

		testaConta.inicializaConta(400, "3333", "rhedson", 10, 01);
		// executar um deposito
		testaConta.deposito(500);
		// Imprimir o saldo apos o deposito
		testaConta.imprimeDados();
		// executar um saque cujo valor seja menor que o saldo
		// Imprimir o saldo apos o deposito
		testaConta.saque(250);
		// executar uma retirada cujo valor seja maior que o saldo

		testaConta.saque(1000);
		// Imprimir o saldo apos o deposito
		testaConta.imprimeDados();
	}
}
