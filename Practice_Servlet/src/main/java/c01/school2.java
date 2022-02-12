package c01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/school2")
public class school2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public school2() {
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init!");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		request.setCharacterEncoding("UTF-8");
		
		Enumeration<String> subjects = request.getParameterNames();
		//subjects에다가 school2.html의 체크박스에 체크된 input태그들의 name속성을 넣어줌
		
		while(subjects.hasMoreElements()) {
			String name = (String)subjects.nextElement(); 
			String[] values = request.getParameterValues(name);
			// name에 들어간 값도 출력할 수 있게됨
			System.out.println("신청목록");
			for(String value : values) {
				System.out.println("유형 : " + name + ", 목록 : " + value);
		}
		
		
	}

	}

}
