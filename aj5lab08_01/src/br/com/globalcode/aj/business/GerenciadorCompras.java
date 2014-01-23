package br.com.globalcode.aj.business;

import br.com.globalcode.aj.dao.ProdutoDAO;
import br.com.globalcode.aj.dao.ProdutoDB;
import br.com.globalcode.beans.CarrinhoCompras;
import br.com.globalcode.beans.Item;
import br.com.globalcode.beans.Produto;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class GerenciadorCompras {
    private Produto getProdutoSelecionado(HttpServletRequest request) throws ServletException {
        String strIdProduto = request.getParameter("idProduto");
        Produto prod = null;
        ProdutoDAO dao = new ProdutoDB();

        try {
            int id = Integer.parseInt(strIdProduto);
            prod = dao.getProdutoById(id);
            System.out.println("[AdicionarProdutoCarrinho:getProdutoSelecionado] Produto selecionado ");
            System.out.println(prod);
        } catch (Exception e) {
            throw new ServletException(e);
        }
        return prod;

    }

    public void adicionarProdutoCarrinho(HttpServletRequest request) throws ServletException{
        Produto produtoSelecionado = getProdutoSelecionado(request);
        System.out.println(produtoSelecionado);
        // Criando um novo item com o produto selecionado, quantidade igual a 1
        Item item = new Item(produtoSelecionado, 1);
        CarrinhoCompras carrinho = null;

        HttpSession session = request.getSession();
        carrinho = (CarrinhoCompras) session.getAttribute("carrinhoCompras");
        
        if (carrinho == null) { // se o carrinho de compras ainda não existe ...
            // Criando o objeto carrrinho de compras
            // passando o item como parametro no construtor
            carrinho = new CarrinhoCompras(item);
            session.setAttribute("carrinhoCompras", carrinho);
        } else { // se o carrinho de compras ja existe ...
            // Adicionando o item no carrinho atraves do metodo addItem
            carrinho.addItem(item);
        }
    }
}
