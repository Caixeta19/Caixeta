package Controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/processaFormulario")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		// Definindo o enconding para UTF-8
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//Obtendo os parametros do formulario
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String Senha = request.getParameter("Senha");
		String Data = request.getParameter("Data");
		String Genero = request.getParameter("gridRadios");

	    if ("Masculino".equals(Genero)) {
	        // Masculino selecionado
	    } else if ("Feminino".equals(Genero)) {
	        // Feminino selecionado
	    } else if ("Prefiro não dizer".equals(Genero)) {
	        // Prefiro não dizer selecionado
	    }
	    
		String Endereco = request.getParameter("Endereco");
		String Endereco2 = request.getParameter("Endereco2");
		String Cidade = request.getParameter("Cidade");
		String Estado = request.getParameter("Estado");
		String CEP = request.getParameter("CEP");
		String Telefone = request.getParameter("Telefone");
	    
		
		//Gerando a resposta
		try(PrintWriter out = response.getWriter()){
			
			out.println("<html><body>");
			out.println("<h2>Cadastro realizado com sucesso! </h2>");
			out.println("<p>Name:" +Name+ "</p>");
			out.println("<p>Email:" +Email+ "</p>");
			out.println("<p>Senha:" +Senha+ "</p>");
			out.println("<p>Data:" +Data+ "</p>");
			out.println("<p>Genero:" +Genero+ "</sp>");
			out.println("<p>Endereco:" +Endereco+ "</p>");
			out.println("<p>Endereco2:" +Endereco2+ "</p>");
			out.println("<p>Cidade:" +Cidade+ "</p>");
			out.println("<p>Estado:" +Estado+ "</p>");
			out.println("<p>CEP:" +CEP+ "</p>");
			out.println("<p>Telefone:" +Telefone+ "</p>");
			out.println("</body></html>");
			
		}
		
	}

}
