/**
 * @author Globalcode 
 * TesteGravacaoCliente.java
 */

package br.com.globalcode.teste;

import br.com.globalcode.beans.Cliente;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteGravacaoCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Joao da Silva", "11-8558-7447",
				"11232404-6", 1);
		String nomeArquivo1 = "Cliente" + cliente1.getCpf() + ".ser";
		FileOutputStream gravador = null;
		ObjectOutputStream gravadorObjetos = null;

		try {
			gravador = new FileOutputStream(nomeArquivo1);//local onde vai ser salvo o arquivo!!!

			/*
			 * preencha o codigo de escrita de objeto a partir deste ponto
			 */
			gravadorObjetos = new ObjectOutputStream(gravador);
			gravadorObjetos.writeObject(cliente1);

			System.out.println("Cliente gravado com sucesso!!");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			// fechando os streams
			try {
				if (gravadorObjetos != null)
					gravadorObjetos.close();
				else if (gravador != null) {
					gravador.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
