package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	final static String driver = "oracle.jdbc.driver.OracleDriver";
	final static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	final static String userid = "PRACTICECONN";
	final static String password = "PRACTICECONN";
	
	private static Connection _stconn = null; // null이면 연결되지 않은 상태
	
	public static Connection getConnection() {
		try {
			if(_stconn != null) { // null이 아니면 연결된거임
				return _stconn;
			}
			System.out.println(">>>Oracle Connection Test<<<");
			Class.forName(driver);
			
			_stconn = DriverManager.getConnection(url, userid, password); // url, userid, password 변수를 가져와서 연동
			System.out.println("[getConnection] Connection: success " + (_stconn != null)); // 연결이되면 출력할 문구
			System.out.println("[getConnection] Connection: autocommit " + _stconn.getAutoCommit()); // 자동커밋모드사용 true, 사용ㄴㄴ = false
			
			boolean dbClosed = _stconn.isClosed(); //isClosed함수는 닫히면 true, 열려있으면 false
			System.out.println("[getConnection] isClosed " + dbClosed); // 열려있는지 확인해보기 위해 출력
			
		}
		catch(ClassNotFoundException e) {
			System.out.println(">> ClassNotFoundException " + e.toString());
		}
		catch(SQLException e) {
			System.out.println(">> SQLException " + e.toString());
		}
		catch(Exception e){
			System.out.println(">> Exception " + e.toString());
		}
		return _stconn;
	}
	
	public static void closeConnection() {
		try {
			if(_stconn != null && _stconn.isClosed() != true) {
				_stconn.close(); // _stconn이 연결되어있거나 닫혀있지 않으면 연결을 끊어라
			}
			
		}
		catch(SQLException e) {
			System.out.println(">> SQLException " + e.toString());
		}
		catch(Exception e) {
			System.out.println(">> Exception " + e.toString());
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(" ** Oracle Connection Test ** ");
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, userid, password);
			System.out.println("[main] 연결성공여부 ? " + (conn != null));
			
			boolean dbClosed = conn.isClosed();
			System.out.println("[main] isClosed " + dbClosed);
			
			conn.close();
			System.out.println("[main] 제대로 닫혔는가 ? " + conn.isClosed());
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("[main] ClassNotFoundException " + e.toString());
		}
		catch(SQLException e) {
			System.out.println("[main] SQLException " + e.toString());
		}
		catch(Exception e) {
			System.out.println("[main] Exception " + e.toString());
		}
		

	}

}
