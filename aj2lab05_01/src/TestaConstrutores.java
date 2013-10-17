/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    
    Conta c1 = new Conta(4000, "numConta", "rhedson", "abcd", 50);
    c1.imprimeDados();
    
    Cliente cli1 = new Cliente( "Cliente Rhedson", "123457cpf");
    cli1.imprimeDados();
    
    }
}
