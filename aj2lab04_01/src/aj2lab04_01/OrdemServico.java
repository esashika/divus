package aj2lab04_01;

public class OrdemServico {

	String nomeDoFuncionario;
	String descricaoProblema;
	int prioridade = 5;

	// public OrdemServico(String nomeDoFuncionarioMetodo,
	// String descricaoProblemaMetodo) {
	// this.nomeDoFuncionario = nomeDoFuncionarioMetodo;
	// this.descricaoProblema = descricaoProblemaMetodo;
	// }

	public OrdemServico(String nomeDoFuncionarioMetodo,
			String descricaoProblemaMetodo) {

		this.nomeDoFuncionario = nomeDoFuncionarioMetodo;
		this.descricaoProblema = descricaoProblemaMetodo;

	}

	public OrdemServico(String nomeDoFuncionarioMetodo,
			String descricaoProblemaMetodo, int prioridade) {
		
		this(nomeDoFuncionarioMetodo, descricaoProblemaMetodo);
		this.prioridade = prioridade;
	}

}
