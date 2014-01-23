import java.text.NumberFormat;
import java.util.Locale;

public class TesteNumberFormat {

	public static void main(String[] args) {

		String idioma = "pt";
		String pais = "BR";

		Locale localidade = Locale.US;// informa a localidade onde ser‡ feita a
										// formatacao

		NumberFormat formatadorNumerico = NumberFormat.getInstance(localidade);
		NumberFormat formatadorMonetario = NumberFormat
				.getCurrencyInstance(localidade);
		NumberFormat formatadorPercentual = NumberFormat
				.getPercentInstance(localidade);

		formatadorNumerico.setMinimumFractionDigits(2);
		formatadorNumerico.setMaximumFractionDigits(3);

		System.out.println("numero: " + formatadorNumerico.format(123.4567));
		System.out.println("Moeda: " + formatadorMonetario.format(123.4567));
		System.out.println("Percentual:"
				+ formatadorPercentual.format(123.4567));

	}

	static String formatarMoeda(double valor) {

		Locale localidade = Locale.US;// informa a localidade onde ser‡ feita a
										// formatacao

		NumberFormat formatadorNumerico = NumberFormat.getInstance(localidade);
		

		formatadorNumerico.setMinimumFractionDigits(2);
		formatadorNumerico.setMaximumFractionDigits(3);

		
		return formatadorNumerico.format(valor);

	}

}
