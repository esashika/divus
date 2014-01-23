package br.com.globalcode.aj.ecommerce;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import br.com.globalcode.aj.dao.ProdutoDAO;
import br.com.globalcode.aj.dao.ProdutoDB;
import br.com.globalcode.beans.Produto;
import br.com.globalcode.util.GlobalcodeException;

public class CatalogoProdutosView extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Obtencao do canal de envio de dados para o cliente
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Catalogo Produtos - Academia do Java</title>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link href= 'aj.css' rel='stylesheet' type='text/css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<H3>Catalogo de produtos </H3>");
        // Inicio da tabela de produtos
        out.println("<TABLE width = '700' border='0'>");

        //Linha de titulo
        out.println("<TR width = '%100' class='tituloCampo'>");
        out.println("<TD width = '%20'>Imagem</TD>");
        out.println("<TD width = '%10' >Nome</TD>");
        out.println("<TD width = '%10' >Codigo</TD>");
        out.println("<TD width = '%10'  >Descri&ccedil;&atilde;o</TD>");
        out.println("<TD width = '%10' >Pre&ccedil;o</TD>");
        out.println("<TD width = '%20' colspan = '2'>Comprar</TD>");
        out.println("</TR>");

        // -------------------------------------------------------------------
        // Insira a partir daqui o codigo pedido na apostila:
        // -------------------------------------------------------------------


        ProdutoDAO dao = new ProdutoDB();
        List <Produto> listaProdutos =null;
        
        try {
			listaProdutos = dao.getCatalogoProdutos();
		} catch (GlobalcodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for (Produto produto : listaProdutos) {
			
        	 // Primeiro produto
            out.println("<TR width = '%100'>");
            out.println("<TD width = '%20'> <IMG SRC = 'imagem/"+produto.getImage()+ "'/></TD>");
            out.println("<TD width = '%10'  class='gridCampo'>"+produto.getNome()+ "</TD>");
            out.println("<TD width = '%10' class='gridCampo'>"+produto.getCodigo()+ "</TD>");
            out.println("<TD width = '%10'  class='gridCampo'>"+produto.getDescricao()+ "</TD>");
            out.println("<TD width = '%10' class='gridCampo'>"+produto.getPreco()+ "</TD>");
            out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto="+produto.getId()+ "' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
            out.println("</TR>");
        	
		}
        
       
        
        
//        // Segundo produto
//        out.println("<TR width = '%100'>");
//        out.println("<TD width = '%20'> <IMG SRC = 'imagem/cd002.gif'/></TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>CD - Ta Nervoso...Vai Pesca</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>cd002</TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>Ataide & Alexandre</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>R$ 15</TD>");
//        out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=79' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
//        out.println("</TR>");
//        // Terceiro produto
//        out.println("<TR width = '%100'>");
//        out.println("<TD width = '%20'> <IMG SRC = 'imagem/cd001.gif'/></TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>CD - As Gargantas do Brasil</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>cd001</TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>Milionario e Jose Rico</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>R$ 13</TD>");
//        out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=83' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
//        out.println("</TR>");
//        // Quarto produto'
//        out.println("<TR width = '%100'>");
//        out.println("<TD width = '%20'> <IMG SRC = 'imagem/cd003.gif'/></TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>CD - Meu Reino Encantado</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>cd003</TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>Daniel</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>R$ 18</TD>");
//        out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=85' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
//        out.println("</TR>");
//        // Quinto produto
//        out.println("<TR width = '%100'>");
//        out.println("<TD width = '%20'> <IMG SRC = 'imagem/maqFot001.gif'/></TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>Maquina fotografica</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>maqFot001</TD>");
//        out.println("<TD width = '%10'  class='gridCampo'>Maqiuna fotografica</TD>");
//        out.println("<TD width = '%10' class='gridCampo'>R$ 80</TD>");
//        out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=86' ><IMG SRC = 'imagem/carrinho.gif'/></A></TD>");
//        out.println("</TR>");
        // final da tabela de produtos
        out.println("</TABLE>");
        out.println("</body>");
        out.println("</html>");
    }
}
