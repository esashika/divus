/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.gui;

import java.util.List;

import javax.swing.JComboBox;

import br.com.globalcode.beans.Cliente;
import br.com.globalcode.dao.ClientesDAO;
import br.com.globalcode.dao.ClientesDAOSerialization;
import br.com.globalcode.util.GlobalcodeException;

/**
 * @author Globalcode
 * 
 */
public class ComboClientes extends JComboBox {

    public ComboClientes() throws GlobalcodeException {
        this.reloadFromDatabase();
    }

    public void reloadFromDatabase() throws GlobalcodeException {
        ClientesDAO db = new ClientesDAOSerialization();
        List<Cliente> clientes = db.getAllClientes();
        this.removeAllItems();
        for (int i = 0; i < clientes.size(); i++) {
            this.addItem(clientes.get(i));
        }
    }
}
