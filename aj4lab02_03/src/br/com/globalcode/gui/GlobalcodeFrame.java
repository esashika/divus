/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GlobalcodeFrame extends JFrame {

    private static final String IMAGEM_DEFAULT = "imagens/LogoAcademiaJava.gif";
    private static final String TITULO_DEFAULT = "Globalcode Default Frame";

    public GlobalcodeFrame() {
        this(TITULO_DEFAULT, IMAGEM_DEFAULT);
    }

    public GlobalcodeFrame(String titulo) {
        this(titulo, IMAGEM_DEFAULT);
    }

    public GlobalcodeFrame(String titulo, String imagemFrame) {
        super(titulo);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image image = Toolkit.getDefaultToolkit().createImage("imagens/LogoAcademiaJava.gif");
        super.setSize(300, 200);
        super.setIconImage(image);
    }

    public void displayError(Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
    }
}
