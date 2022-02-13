package db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class oracleSQL {

	public void select() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		System.out.println("HELLO table select");
		
		try {
			String sql = "SELECT * FROM PRACTICE ORDER BY HID";
			
			conn = DBConnect.getConnection(); // 내가만든 DBConnect클래스에 있는 getConnection()를 가져와서 변수conn에 대입
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql); // db의 select구문을 수행할때 쓰는 함수 executeQuery
				//ResultSet의 객체인 rset에 결과값을 넣어주는 용도
			System.out.println("[HID]   [HNAME]   [HTEL]");
			System.out.println("---------------------------------");
			
			while(rset.next()) { //반복문으로 돌려주며 값을 가져옴 - 순서가 중요함. 순서대로 hid, hname, htel 이기때문에 getString(숫자)숫자도 순서대로 적어줘야함
				String hid = rset.getString(1); // 
				String hname = rset.getString(2);
				String htel = rset.getString(3);
				//위 getString으로 모든 컬럼의 데이터값을 String타입으로 받아올수있음.
				System.out.println(hid + "   " + hname + "   " + htel);
			}
		}
		catch(SQLException e) {
			System.out.println("select : SQLException " + e.toString());
		}
		finally {
			try {
				if(rset != null) {
					rset.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}
				catch(Exception e) {
					System.out.println("select : finally Exception " + e.toString());
				}
			}
		
	}
	
	public void insert(String hid, String hname, String htel) {
		String sql = String.format("INSERT INTO PRACTICE VALUES('%s', '%s', '%s')", hid, hname, htel);
		
		Connection conn = null;
		Statement stmt = null;
		
		System.out.println("Hello tabld insert");
		
		try {
			conn = DBConnect.getConnection(); //db연결함수 불러오기
			stmt = conn.createStatement();
			int success = stmt.executeUpdate(sql); // 처리결과 갯수를 리턴해줌 - 그래서 success의 데이터타입이 int이다
			
			if(success > 0) {
				System.out.println("insert 성공! " + success + "개 생성");
			}
			else {
				System.out.println("insert 실패! " + success + "개 생성");
			}
		}
		catch(SQLException e) {
			System.out.println("insert : SQLException " + e.toString());
		}
		finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			}
			catch(Exception e) {
				System.out.println("insert: finally Exception " + e.toString());
			}
		}
		
	}
	
	public void update(String hid, String hname, String htel) {
		String sql = String.format("UPDATE PRACTICE SET hname = '%s', htel ='%s' WHERE hid = '%s'", hname, htel, hid);
		
		Connection conn = null;
		Statement stmt = null;
		System.out.println("Hello table update");
		
		try {
			conn = DBConnect.getConnection();
			stmt = conn.createStatement();
			int success = stmt.executeUpdate(sql); //처리결과 갯수 리턴
			
			if(success > 0) {
				System.out.println("update 성공! " + success + "개 수정");
			}
			else {
				System.out.println("update 실패! " + success);
			}
		}
		catch(SQLException e) {
			System.out.println("update : SQLException " + e.toString());
		}
		finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			}catch(Exception e) {
				System.out.println("update: finally Exception " + e.toString());
			}
		}
		
	}
	
	public void delete(String hid) {
		
		String sql = String.format("DELETE FROM PRACTICE WHERE hid = %s",hid);
		
		Connection conn = null;
		Statement stmt = null;
		System.out.println("Hello table delete");
		
		try {
			conn = DBConnect.getConnection();
			stmt = conn.createStatement();
			int success = stmt.executeUpdate(sql); //처리결과 갯수 리턴
			
			if(success > 0) {
				System.out.println("delete 성공! " + success + "개 삭제");
			}
			else {
				System.out.println("delete 실패! " + success);
			}
		}
		catch(SQLException e) {
			System.out.println("update : SQLException " + e.toString());
		}
		finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			}catch(Exception e) {
				System.out.println("update: finally Exception " + e.toString());
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		oracleSQL hello = new oracleSQL();
//		hello.select();
//		hello.insert("600", "SpringBoot", "010-7777-7777");
//		hello.update("200", "CSS", "010-1313-3131");
		hello.delete("600");
		hello.select();

	}

}
