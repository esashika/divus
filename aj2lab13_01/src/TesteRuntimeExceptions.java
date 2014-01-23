public class TesteRuntimeExceptions {

	public static void main(String[] args) {
		// Leitura do parametro digitado pelo usuario como parametro do main
		String parametro1 = args[0];

		try {
			int numero = Integer.parseInt(parametro1);
		} catch (Exception e) {

			System.out.println("Erro!! - Verifique sua implementação");
			System.out.println("------- printStackTrace");
			e.printStackTrace();
			System.out.println("----- Get Message");
			System.out.println(e.getMessage());

		}
	}
}
