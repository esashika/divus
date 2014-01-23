package br.com.globalcode.aj.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionarProdutoCarrinho extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Obtencao do canal de envio de dados para o cliente
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ecommerce : Academia do Java</title>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
        out.println("<link href= 'aj.css' rel='stylesheet' type='text/css'></link>");
        out.println("</head>");
        out.println("<body>");
        out.println("<H3>Adicionando produtos no carrinho de compras</H3>");
        
        // -------------------------------------------------------------------
        // Insira a partir daqui o codigo pedido na apostila:
        // -------------------------------------------------------------------

        int idProduto = Integer.parseInt(request.getParameter("idProduto"));
        out.println("Produto" + idProduto);
        
       
        // Devemos imprimir somente o codigo do produto, pois esta e a unica informacao recebida.        
       
        out.println("</body>");
        out.println("</html>");
    }
}
