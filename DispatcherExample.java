package Day6;


	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.io.PrintWriter;
	@WebServlet("/request")
	public class DispatcherExample extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String sw1=request.getParameter("email");
			String sw2=request.getParameter("password");
			PrintWriter out=response.getWriter();
			if(sw1.equals("sowmya@gmail.com")&&sw2.equals("123456")) {
				out.println("worked");
				request.getRequestDispatcher("login.html").forward(request, response);
			}
			else {
				out.println("error check details");
				request.getRequestDispatcher("index.html").include(request, response);
			}

			
		}

		 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
			doGet(request, response);
		}

	}
