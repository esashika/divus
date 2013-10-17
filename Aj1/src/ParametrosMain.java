public class ParametrosMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 5) {
			System.out.println("favor preencha corretamente os campos");
		}

		String nome = args[0];
		String dataNascimento = args[1];
		String rg = args[2];
		String salario = args[3];
		String sexo = args[4];

		String textNome = "O(a) Senhor(a) " + nome;
		String textNasc = ", nascido(a) em " + dataNascimento;
		String textRg = " portador(a)do rg de numero " + rg + ", \n";
		String textSexo = " do sexo " + sexo;
		String textTrabalho = ", est‡ registrado(a) com o sal‡rio de R$ "
				+ salario + ".";
		System.out.println(textNome + textRg + textNasc + textSexo
				+ textTrabalho);

	}
}
