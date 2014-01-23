package br.com.globalcode.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.globalcode.util.GlobalcodeException;

/*
 * Importante:
 * Este codigo sera utilizado pela classe EditorTexto por isto:
 *  
 * 1. Nao altere a assinatura dos metodos desta classe, ou seja, mantenha todos 
 * os modificadores, os parametros e as exceptions lançadas.
 * 2. Nao altere o nome desta classe
 * 
 * OBS: Na abertura dos arquivos, o texto aberto estara deslocado em relaçao a
 * atual tela. Para confirmar a abertura do arquivo, utilize as barras de rolagem 
 * na tela de edição.
 * 
 */
public class FileSaver {

	public static void save(String texto, String fileName)
			throws GlobalcodeException {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
//			fileWriter.write(texto);
//			fileWriter.flush();
//			fileWriter.close();

			//2 solucao
			BufferedWriter buffer = new BufferedWriter(fileWriter);
			buffer.write(texto);
			buffer.flush();
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String read(String fileName) throws GlobalcodeException {

		StringBuffer buffer = new StringBuffer();

		try {
			FileReader filereader = new FileReader(fileName);
//			int letra;
//			try {
//				while ((letra = filereader.read()) != -1) {
//					buffer.append((char) letra);
//
//				}
			
			//2 solucao
			
			BufferedReader reader = new BufferedReader(filereader);
			String linha;
			while ((linha = reader.readLine())!=null) {
				buffer.append(linha);
				buffer.append("\n");
				
			}
			} catch (IOException e) {
				throw new GlobalcodeException(e,
						"nao foi possivel abrir o arquivo" + fileName);

			}
		

		return buffer.toString();// trocando o valor null pela string
	}
}
