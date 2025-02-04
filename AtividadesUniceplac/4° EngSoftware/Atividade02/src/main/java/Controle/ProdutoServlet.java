package Controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	        List<Produtoo> produtos = new ArrayList<>();
	        produtos.add(new Produtoo("Produto A", 10.99, "Descrição do Produto A"));
	        produtos.add(new Produtoo("Produto B", 15.49, "Descrição do Produto B"));
	        produtos.add(new Produtoo("Produto C", 20.00, "Descrição do Produto C"));

	        request.setAttribute("listaProdutos", produtos);
	        request.getRequestDispatcher("/listaProdutos.jsp").forward(request, response);
	 
	}
}


