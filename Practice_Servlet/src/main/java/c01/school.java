package c01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/school")
public class school extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public school() {
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 실행");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 실행");
		
		request.setCharacterEncoding("UTF-8");
		
		String[] subjects = request.getParameterValues("subject");
		//school.html에서 input태그안에 name이 subject인 것들이 체크되었을 때
		//그 체크된 데이터들이 위 subjects배열에 담기게 됨.
		System.out.println("수강목록");
		
		for(String selectedSubject : subjects) {//향상된for문으로 체크된 데이터들 출력
			System.out.println("신청한 과목 : " + selectedSubject);
		}
		
	}

}
