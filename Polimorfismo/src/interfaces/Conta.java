package interfaces;

import java.util.Date;

public abstract class Conta implements Notificavel {
	
	Date dataVencimento;
	double valor;

	public Conta(Date dataVencimento, double valor) {
		super();
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String getMensagem() {
		return " Conta vence data:" + dataVencimento;
	}
}
