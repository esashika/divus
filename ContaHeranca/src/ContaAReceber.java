public class ContaAReceber extends Conta {

	String dataDoVencimento;
	double juros;
	boolean pago;

	public String getDataDoVencimento() {
		return dataDoVencimento;
	}

	public void setDataDoVencimento(String dataDoVencimento) {
		this.dataDoVencimento = dataDoVencimento;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

public static void main(String[] args) {
	
//	ContaAReceber CAR1 = new ContaAReceber();
//	CAR1.setBanco("Brasil");
//	CAR1.setValor(5000);
//	CAR1.setDescricao("Conta de Luz");
//	CAR1.setDataDoVencimento("01/01/2013");
//	CAR1.setPago(false);
//	CAR1.setJuros(23);
}

}
