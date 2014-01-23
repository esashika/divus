package interfaces;

import java.util.Date;

public class Principal {
	
	public static void main(String[] args) {
		
		Caminhao caminhao = new Caminhao(71000, "jxw-1010");
		ContaAPagar conta = new ContaAPagar(new Date(), 10000);
		
//		Notificavel not1 = caminhao;
//		Notificavel not2 = conta;
//		Notificavel[] arrayNotificacoes = new Notificavel[]{not1,not2};
//		TelaNoficacoes tela = new TelaNoficacoes();
//		tela.exibirNotificacoes(arrayNotificacoes);
		TelaNoficacoes tela = new TelaNoficacoes();
		tela.exibirNotificacoes(new Notificavel[]{caminhao, conta});
		
	}

}
