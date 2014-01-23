package interfaces;

public class Caminhao implements Notificavel {
	
	int kilometragem;
	String placa;
	
	public Caminhao(int kilometragem, String placa) {
		super();
		this.kilometragem = kilometragem;
		this.placa = placa;
	}

	@Override
	public String getMensagem() {
		return "Revisao programada: " + kilometragem + " placa:" + placa;
	}
	
	
}
