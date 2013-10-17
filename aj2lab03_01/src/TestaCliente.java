/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
    	
    	Cliente testaCliente = new Cliente();
    	// Inicializacao do cliente usando o metodo inicializaCliente
    	testaCliente.inicializaCliente("rhedson", "1234567cpf");
        // Impressao dos dados do cliente
    	testaCliente.imprimeDados();
    }
}
