package br.com.globalcode.util;

/**
 * @author Globalcode
 * 
 */
public class GlobalcodeException extends Exception {

    public GlobalcodeException(Exception e, String mensagem) {
        super(mensagem, e);
    }

    public GlobalcodeException(String mensagem) {
        super(mensagem);
    }
}
