package br.com.globalcode.testes;

import java.io.Console;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

import br.com.globalcode.util.FiltroGenerico;

public class TesteFiltros {
	public static void main(String args[]) {
// 		Solucao com Scanner
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Informe o diretorio:");
//		String nomeDiretorio = sc.nextLine();
//		System.out.println("Informe a Extens‹o:");
//		String extensao = sc.nextLine();
//		File diretorio = new File(nomeDiretorio);

		Console console = System.console();
		String nomeDiretorio = console.readLine("Informe o Diretorio");
		String extensao = console.readLine("Informe a Extens‹o:");

		File diretorio = new File(nomeDiretorio);
		
		if (diretorio.isDirectory()) {
			// Criando o filtro que mostra somente arquivos com a extensao
			// indicada

			FilenameFilter filtro = new FiltroGenerico(extensao);

			// Diretiva para listar os arquivos do diretorio, adicionando
			// habilidade de filtro

			String arquivos[] = diretorio.list(filtro);

			System.out.println("Lista de arquivos com a extensao :" + extensao);
			for (String nomeArquivo : arquivos) {
				System.out.println(nomeArquivo);
			}
		} else {
			System.out.println("Nao Ã© um diretorio");
		}
	}
}
