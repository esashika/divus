/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

	public static void main(String[] args) {

		Conta variavelConta = new Conta();

		int a = 2, resultado;

		variavelConta.agencia = 1;
		variavelConta.banco = 234;
		variavelConta.numero = "01945";
		variavelConta.titular = "GLOBALCODE";
		variavelConta.saldo = 10000;

		System.out.println("------------------------------------");
		System.out.println("AGENCIA:" + variavelConta.agencia + " BANCO: "
				+ variavelConta.banco);
		System.out.println("NUMERO:" + variavelConta.numero);
		System.out.println("TITULAR: " + variavelConta.titular);
		System.out.println("SALDO: R$ " + variavelConta.saldo);
		System.out.println("------------------------------------");

	}
}
