package interfaces;

public class TelaNotificacoes {

	public void exibirNotificacoes(Notificavel[] notificacoesVariavel) {
		for (Notificavel notificavel : notificacoesVariavel) {
			System.out.println(notificavel.getMensagem());
		}
	}
}
