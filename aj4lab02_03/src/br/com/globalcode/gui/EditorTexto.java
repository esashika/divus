/*
 * Globalcode - "The Developers Company"
 * Academia do Java 
 */
package br.com.globalcode.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;
import javax.swing.*;
import br.com.globalcode.io.FileSaver;
import br.com.globalcode.util.GlobalcodeException;

public class EditorTexto extends GlobalcodeFrame {

    public static void main(String[] args) {
        EditorTexto tp = new EditorTexto();
        tp.toFront();
    }

    // Referencia que sera utilizada pelas Inner Classes
    EditorTexto editorTexto = null;
    List<JPanel> documentosAbertos = new ArrayList<JPanel>();
    JPanel documentoAtual;
    // EditorTexto documento
    private JTabbedPane gerenciadorArquivosAbertos;

    public EditorTexto() {
        super("Exemplo de TabbedPane");
        // Referencia que sera utilizada pelas Inner Classes
        editorTexto = this;
        // Construindo e configurando a barra de menus
        JMenuBar barraMenu = montaBarraMenu();
        this.setJMenuBar(barraMenu);
        // Criando uma instancia de JTabbedPane, que sera o gerenciador de arquivos abertos.
        // cada novo arquivo representara um PanelEditorTexto, que e um JPanel adicionado ao
        // TabbedPane
        gerenciadorArquivosAbertos = new JTabbedPane();
        this.getContentPane().add(gerenciadorArquivosAbertos);
        this.setSize(600, 600);
        this.setVisible(true);
    }

    private JMenuBar montaBarraMenu() {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        JMenuItem itemNew = new JMenuItem("New");
        itemNew.setMnemonic(KeyEvent.VK_N);
        itemNew.addActionListener(new NovoDocumentoHandler());
        JMenuItem itemSave = new JMenuItem("Save");
        itemSave.setMnemonic(KeyEvent.VK_S);
        itemSave.addActionListener(new SalvarDocumentoHandler());
        JMenuItem itemSaveAs = new JMenuItem("Save As");
        itemSaveAs.setMnemonic(KeyEvent.VK_A);
        itemSaveAs.addActionListener(new SalvarComoDocumentoHandler());
        JMenuItem itemOpen = new JMenuItem("Open");
        itemOpen.setMnemonic(KeyEvent.VK_O);
        itemOpen.addActionListener(new AbrirDocumentoHandler());
        JMenuItem itemClose = new JMenuItem("Close");
        itemClose.setMnemonic(KeyEvent.VK_C);
        itemClose.addActionListener(new FecharDocumentoHandler());
        menuFile.add(itemNew);
        menuFile.add(itemSave);
        menuFile.add(itemSaveAs);
        menuFile.add(itemOpen);
        menuFile.add(itemClose);
        JMenu menuView = new JMenu("View");
        menuFile.setMnemonic(KeyEvent.VK_V);
        JMenuItem itemHtmlPreview = new JMenuItem("HTML preview");
        itemHtmlPreview.setMnemonic(KeyEvent.VK_A);
        itemHtmlPreview.addActionListener(new HTMLPreviewHandler());
        menuView.add(itemHtmlPreview);
        JMenuItem itemTextView = new JMenuItem("Edit");
        itemTextView.setMnemonic(KeyEvent.VK_E);
        itemTextView.addActionListener(new EditDocumentHandler());
        menuView.add(itemTextView);
        menuView.add(itemHtmlPreview);
        barraMenu.add(menuFile);
        barraMenu.add(menuView);
        return barraMenu;
    }

    private String leNomeArquivo() {
        String nomeArq = null;
        JFileChooser chooser = new JFileChooser();
        int opcao = chooser.showSaveDialog(editorTexto);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            nomeArq = chooser.getSelectedFile().getName();
            File currentDirectory = chooser.getCurrentDirectory();
            nomeArq = currentDirectory + File.separator + nomeArq;
            System.out.println("Voce escolheu salvar o arquivo: " + nomeArq);
        }
        return nomeArq;
    }

    class SalvarDocumentoHandler implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            Documento documentoAtual = (Documento) gerenciadorArquivosAbertos.getSelectedComponent();
            String nomeArq = documentoAtual.getNomeArquivo();
            // Arquivo ainda nao foi salvo
            if (nomeArq.equals("")) {
                nomeArq = leNomeArquivo();
                if (nomeArq != null) {
                    documentoAtual.setNomeArquivo(nomeArq);
                    gerenciadorArquivosAbertos.setTitleAt(documentosAbertos.indexOf(documentoAtual), nomeArq);
                    try {
                        FileSaver.save(documentoAtual.loadTextoFromEditor(), nomeArq);
                    } catch (GlobalcodeException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    FileSaver.save(documentoAtual.loadTextoFromEditor(), nomeArq);
                } catch (GlobalcodeException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class SalvarComoDocumentoHandler implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            Documento documentoAtual = (Documento) gerenciadorArquivosAbertos.getSelectedComponent();
            // Arquivo sera salvo com outro nome
            String nomeArq = leNomeArquivo();
            if (nomeArq != null) {
                documentoAtual.setNomeArquivo(nomeArq);
                gerenciadorArquivosAbertos.setTitleAt(documentosAbertos.indexOf(documentoAtual), "Teste");
                try {
                    FileSaver.save(documentoAtual.loadTextoFromEditor(), nomeArq);
                } catch (GlobalcodeException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class FecharDocumentoHandler implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            Documento documentoAtual = (Documento) gerenciadorArquivosAbertos.getSelectedComponent();
            int index = documentosAbertos.indexOf(documentoAtual);
            gerenciadorArquivosAbertos.removeTabAt(index);
            documentosAbertos.remove(index);
        }
    }

    class HTMLPreviewHandler implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            System.out.println("Html preview");
            Documento documentoAtual = (Documento) gerenciadorArquivosAbertos.getSelectedComponent();
            documentoAtual.renderHtmlPreview(true);
        }
    }

    class EditDocumentHandler implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            System.out.println("Html preview");
            Documento documentoAtual = (Documento) gerenciadorArquivosAbertos.getSelectedComponent();
            documentoAtual.renderHtmlPreview(false);
        }
    }

    class NovoDocumentoHandler implements ActionListener {

        private int numeroDocumentos = 0;

        public void actionPerformed(ActionEvent event) {
            System.out.println("NovoDocumenteo");
            JPanel doc = new Documento();
            documentosAbertos.add(doc);
            gerenciadorArquivosAbertos.addTab("Documento " + ++numeroDocumentos, doc);
            gerenciadorArquivosAbertos.setSelectedComponent(doc);
        }
    }

    class AbrirDocumentoHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JFileChooser chooser = new JFileChooser();
            String nomeArq = "";
            int opcao = chooser.showOpenDialog(editorTexto);
            if (opcao == JFileChooser.APPROVE_OPTION) {
                nomeArq = chooser.getSelectedFile().getName();
                File currentDirectory = chooser.getCurrentDirectory();
                nomeArq = currentDirectory + File.separator + nomeArq;
                System.out.println("Voce escol1heu abrir o arquivo: " + nomeArq);
                String texto = "";
                try {
                    texto = FileSaver.read(nomeArq);
                    System.out.println("texto:" + texto);
                } catch (GlobalcodeException e) {
                    displayError(e);
                }
                Documento doc = new Documento();
                doc.loadTextoToEditor(texto, nomeArq);
                documentosAbertos.add(doc);
                gerenciadorArquivosAbertos.addTab(nomeArq, doc);
                gerenciadorArquivosAbertos.setSelectedComponent(doc);
                doc.renderHtmlPreview(false);
            }
        }
    }
}
