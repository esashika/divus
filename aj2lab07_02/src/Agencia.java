/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Implemente o metodo abrirConta seguindo como modelo o metodo 
 * abrirAgencia da classe Banco. Para isto sera necessario criar os
 * atributos e alterar o construtor conforme foi feito na classe Banco.
 * 
 * 2) Depois de alterar o construtor sera necessario alterar na classe 
 * Banco o metodo abrirAgencia para chamar o construtor valido, ou seja,
 * informando o numero de contas que a agencia podera abrir, utilize um 
 * valor fixo, por exemplo 10.
 *  
 * 3) Crie um metodo que faca a impressao das contas que estao dentro da
 * agencia usando como modelo o metodo imprimirAgencias que esta na classe Banco.
 * 
 */
public class Agencia {

	private String numero;
	private Banco banco;
	private static int numeroProximaConta = 1455;
	private int numContasAbertas = 0;
	private Conta contas[];

	/**
	 * @param num
	 *            Numero da agencia
	 * @param bc
	 *            banco ao qual a agencia pertence
	 */
	public Agencia(String num, Banco bc, int numeroMaxContas) {
		numero = num;
		banco = bc;
		contas = new Conta[numeroMaxContas];
	}

	/**
	 * @return Numero do banco
	 */
	public Banco getBanco() {
		return banco;
	}

	/**
	 * @return Numero da agencia
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param b
	 *            banco
	 */
	public void setBanco(Banco b) {
		banco = b;
	}

	/**
	 * Metodo para impressao de todos os dados da classe
	 */
	public void imprimeDados() {
		System.out.println("\nAgencia no. " + numero);
		banco.imprimeDados();
	}

	/**
	 * @param num
	 *            Numero da agencia
	 */
	public void setNumero(String num) {
		numero = num;
	}

	public Conta abrirConta(double saldo, Cliente cliente) {
		Conta c = new Conta(saldo, Integer.toString(numeroProximaConta),
				cliente, this);
		numeroProximaConta++;
		adicionaArrayConta(c);
		return c;
	}

	private void adicionaArrayConta(Conta conta) {
		if (numContasAbertas < contas.length) {
			contas[numContasAbertas] = conta;
			numContasAbertas++;
		} else {
			System.out.println("Errooooorrr, N�o foi possivel criar conta");
		}
	}

	public void imprimeContas() {

		for (int i = 0; i < numContasAbertas; i++) {
			contas[i].imprimeDados();
		}
		
//		for (Conta contasVariavellocalDoForEach : contas) {
//			contasVariavellocalDoForEach.imprimeDados();
//		}
	}
}
