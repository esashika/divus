/**
 * 
 */

/**
 * @author Rhedson
 * interface responsável pela tributacao de impostos
 */
public interface Tributavel {
	public String getDescricaoTributavel();
	public String getNomeImposto();
	public double calcularImpostos();
}
