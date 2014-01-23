/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *  
 */
package br.com.globalcode.gui;

import java.awt.*;
import javax.swing.*;

public class Documento extends JPanel {

    private JTextArea taTexto;
    private String nomeArquivo = "";
    JPanel pHtml;
    JPanel pTexto;
    CardLayout gerenciadorVisualizacao = new CardLayout();
    JPanel pView = new JPanel(gerenciadorVisualizacao);

    public Documento() {
        super(new BorderLayout());
        System.out.println("Criando editor de texto");
        taTexto = new JTextArea(40, 40);
        taTexto.setFont(new Font("Serif", Font.BOLD, 16));
        // taTexto.setLineWrap(true);
        // taTexto.setWrapStyleWord(true);
        taTexto.setSize(300, 300);
        JScrollPane scrollPaneTexto = new JScrollPane(taTexto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pTexto = new JPanel();
        pTexto.setSize(400, 400);
        pTexto.setBackground(Color.YELLOW);
        pTexto.add(scrollPaneTexto, BorderLayout.CENTER);
        pHtml = new JPanel();
        pView.add(scrollPaneTexto, "EditMode");
        pView.add(pHtml, "HTMLPreviewMode");
        this.setOpaque(true);
        this.add(pView);
        this.setBackground(Color.GRAY);
        this.setVisible(true);
        this.setSize(400, 400);
    }

    public void renderHtmlPreview(boolean html) {
        if (html) {
            System.out.println("loadTextFromEditor" + loadTextoFromEditor());
            pHtml.removeAll();
            JLabel textoHtml = new JLabel(loadTextoFromEditor().trim());
            pHtml.add(textoHtml);
            gerenciadorVisualizacao.show(pView, "HTMLPreviewMode");
        } else {
            gerenciadorVisualizacao.show(pView, "EditMode");
        }
    }

    public String loadTextoFromEditor() {
        return taTexto.getText();
    }

    public void loadTextoToEditor(String texto, String fileName) {
        System.out.println("Carregando o texto do arquivo para  o editor");
        this.taTexto.setText(texto);
        this.nomeArquivo = fileName;
    }

    public void clearTextoFromEditor() {
        this.taTexto.setText("");
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}
