package br.com.rhedson.velha.teste;

import java.io.IOException;
import java.util.Random;

import br.com.rhedson.velha.Util;

public class main {

	public static void main(String[] args) throws InterruptedException, IOException {

		Util t = new Util();

		t.inicializaVelha();
	//	t.imprimeVelha();
		Random r = new Random();
		int i=0;
		do{
			
			int jogada = r.nextInt(9);
			if(!t.jogar(jogada)){
				t.jogar(jogada);
			}else{
				System.out.println("====="+i);
				t.imprimeVelha();
				if(t.regrasParaVencer())
					break;
				Thread.sleep(1000);
			}
			
			i++;
		}while(t.isVelha());
		if(!t.isVelha())
			System.out.println("Velhou");
	//	t.regrasParaVencer();
		//t.imprimeVelha();
	}


	


}
