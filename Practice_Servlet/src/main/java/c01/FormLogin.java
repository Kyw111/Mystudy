package c01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormLogin
 */
@WebServlet("/FormLogin")
public class FormLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FormLogin() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드 실행");
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String useraddr = request.getParameter("useraddress");
		// 히든타입의 벨류값을 가져와서 변수에 대입
		sendResponseFormat(response.getWriter(), userid, useraddr); 
		
	}
	
	static void sendResponseFormat(PrintWriter out, String userid, String useraddr) {
		
		String Login = String.format("<h2>로그인 성공!</h2><hr><p>%s님 환영합니다</p>",userid);
		String info = String.format("<p>주소 : %s</p>", useraddr);
		String body = String.format("<body>%s <br> %s </body>", Login, info);
		String html = String.format("<html> %s </html>", body);
		out.print(html);
	}

}
