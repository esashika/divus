package interfaces;

public class TelaNoficacoes {
	
	public void exibirNotificacoes(Notificavel[] notificacoes) {
		
		for (Notificavel notificavel : notificacoes) {
			System.out.println(notificavel.getMensagem());
		}
		
//		for (int i = 0; i < notificacoes.length; i++) {
//			Notificavel notificavel = notificacoes[i];
//			System.out.println(notificavel.getMensagem());
//			
//		}
	}

}
