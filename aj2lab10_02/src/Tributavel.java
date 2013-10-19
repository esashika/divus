/**
 * 
 */

/**
 * @author Rhedson
 * interface respons‡vel pela tributacao de impostos
 */
public interface Tributavel {
	public String getDescricaoTributavel();
	public String getNomeImposto();
	public double calcularImpostos();
}
