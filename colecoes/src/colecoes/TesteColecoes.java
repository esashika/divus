package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TesteColecoes {
	
	public static void main(String[] args) {
		Aluno aluno =  new Aluno("100", "Joao Silva", 30);
		Aluno aluno1 = new Aluno("100", "Joao da Silva", 30);
		
		System.out.println(aluno==aluno1);
		System.out.println(aluno.equals(aluno1));
		
		System.out.println("Aluno: "+aluno.hashCode());
		System.out.println("Aluno1: "+aluno1.hashCode());
		
		List listaAlunos = new ArrayList();
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno);
		listaAlunos.add(new Aluno("50", "Rhedson", 33));
		listaAlunos.add(new Aluno("51", "Enzo", 7));
		listaAlunos.add(new Aluno("52", "Robson", 51));
		listaAlunos.add(new Aluno("53", "Nara", 54));
		
		for (int i = 0; i < listaAlunos.size(); i++) {
			System.out.println (((Aluno)listaAlunos.get(i)).getNome());
		}
		
		
	}

}
