package c01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginP
 */
@WebServlet("/LoginP")
public class LoginP extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginP() {
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost!");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		System.out.println("userid : " + userid);
		System.out.println("userid : " + userpw);
		
		sendResponseFormat(response.getWriter(), userid, userpw);
	}
	static void sendResponseFormat(PrintWriter out, String userid, String userpw) {
		String html = String.format("<html><body><h2>로그인성공</h2><hr>"
				+"<p>아이디: %s</p><p>비밀번호: %s</p></body></html>",userid,userpw);

		// 이런식으로도 가능함. html코드 줄바꿈상관없이 붙여서 쫙 적어도 컴퓨터는 이해할수있음.
//		String html = "<html>";
//		html += "<body>";
//		html += "<h2>로그인성공!</h2>";
//		html += "<hr>";
//		html += "<p>아이디 : " + userid + "</p><br>";
//		html += "<p>비밀번호 : " + userpw + "</p><br>";
//		html += "</body></html>";		
		out.print(html);
		
	}

}