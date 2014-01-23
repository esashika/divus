package br.com.globalcode.util;
import java.io.File;
import java.io.FilenameFilter;

public class FiltroGenerico implements FilenameFilter {
	private String extensao;
	public FiltroGenerico(String extensao) {
		this.extensao = extensao;
	}
	public boolean accept(File dir, String name) {
		/**********************************************************
		 * Se o nome do arquivo terminar com extensao, retorna true
		 * , caso contrario, retorna false
		 **********************************************************/
		boolean ok = name.endsWith(this.extensao);
		return ok;
	}
}
