public class ControleFluxoCondicional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome = "Carolina Pereira";
		int idade = 20;
		String rg = "34.654.789-9";
		char sexo = 'M';
		double salario = 1500.0;
		int anoAtual = 2009;
		double aliquota = 0.20;
		int anoNascimento = anoAtual - idade;
		String sexoPorExtenso = sexo == 'M' ? "masculino" : "feminino";
		double impostoDevido = salario * aliquota;

		String textNome = "O(a) Senhor(a) " + nome;
		String textNasc = ", nascido(a) no ano de " + anoNascimento;
		String textRg = " portador(a)do rg de numero " + rg + ", \n";
		String textSexo = " do sexo " + sexoPorExtenso;
		String textTrabalho = ", est‡ registrado(a) com o sal‡rio de R$ "
				+ salario;
		String textImposto = " e pagar‡ R$ " + impostoDevido + " de imposto.";

		if (sexo == 'M' || sexo == 'm') {
			textNome = ("O Senhor " + nome);
			textNasc = ("Nascido no ano de " + anoNascimento);
			textRg = ("Portador do Rg" + textRg);

		} else if (sexo == 'F' || sexo == 'f') {
			textNome = ("A Senhora " + nome);
			textNasc = ("Nascida no ano de " + anoNascimento);
			textRg = (" Portadora do Rg" + textRg);
		} else {

			textNome = "O(a) Senhor(a) " + nome;
			textNasc = ", nascido(a) no ano de " + anoNascimento;
			textRg = " portador(a)do rg de numero " + rg + ", \n";
		}

		System.out.println(textNome + textRg + textNasc + textSexo
				+ textTrabalho + textImposto);
	}

}
