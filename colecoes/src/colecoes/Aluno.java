package colecoes;

public class Aluno {

	String matricula;
	String nome;
	int idade;

	public Aluno(String matricula, String nome, int idade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {// metodos obirgatorios
		Aluno outroAluno = (Aluno) obj;
		return this.matricula.equals(outroAluno.matricula);

	}

	@Override
	public int hashCode() {// metodos obrigatorios
		return this.matricula.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + "" + matricula + "" + idade;
	}
}
