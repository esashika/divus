package br.com.rionegro.model.bean;

public class CalculoProfSituacao {

	String situacao;
	double profHoje;
	double profOntem;

	
	public double getProfHoje() {// retorna o valor da profundidade
		return profHoje;
	}

	private double getCalculaDiferencaProf() {// calcula a difereca mais ou
												// menos da profundidade

		double diferencaProf = profHoje - profOntem;
		return diferencaProf;
	}

	public String getSituacao() {

		if (profHoje > profOntem) {
			situacao = "Encheu";
		}
		if (profHoje < profOntem) {
			situacao = "Secou";
		}
		if (profHoje == profOntem) {
			situacao = "Manteve";
		}
		return situacao;
	}

	private void imprimir() {

		System.out.println(getSituacao());
		System.out.println(getCalculaDiferencaProf());
		System.out.println(profHoje);
		System.out.println(profOntem);

	}

	public static void main(String[] args) {

		CalculoProfSituacao obj1 = new CalculoProfSituacao();
		obj1.profHoje = (45);
		obj1.profOntem = (50);
		obj1.imprimir();

	}

}
