package br.com.globalcode.aj.ecommerce;

import br.com.globalcode.aj.business.GerenciadorCompras;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionarProdutoCarrinho extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GerenciadorCompras gerenciador = new GerenciadorCompras();
        gerenciador.adicionarProdutoCarrinho(request);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/CarrinhoComprasView.jsp");
        dispatcher.forward(request, response);
    }


}
