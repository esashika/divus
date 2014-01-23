/*
 * ValidaPedido.java
 */
package br.com.globalcode.aj.ecommerce;

import br.com.globalcode.aj.business.ValidadorPedido;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidaPedido extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ValidadorPedido validador = new ValidadorPedido();
        validador.validarPedido(request);
        List<String> listaDeProblemas = (List<String>) request.getAttribute("problemas");

        String destino = null;

        // ------------------------------------------------------------------------
        // Adicione aqui o c��digo pedido na apostila
        // ------------------------------------------------------------------------


if (listaDeProblemas.size()>0){
	
	destino="jsp/ListaProblemasPedidos.jsp";
	
}else{
	
	destino = "jsp/PedidoView.jsp";
}

        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);

    }

}
