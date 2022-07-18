package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconnect.common.JDBCUtil;

//DAO(Data Access Object) DB 작업을 수행하는 코드
public class PersonDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	//CRUD(Create, Read, Update, Delete)
	
	//자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO person(userid, userpw, name, age) VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());  //입력된 아이디 가져와서 sql에 세팅
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			pstmt.executeUpdate();  //db에 저장
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}

	//자료 전체 조회
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		//db 연결
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);  //sql 실행
			rs = pstmt.executeQuery();   //데이터 반환받음
			while(rs.next()) {  //자료가 있는 동안 반복
				Person person = new Person();
				person.setUserId(rs.getString("userid"));  //db 테이블의 칼럼 가져옴
				person.setUserPw(rs.getString("userPw"));  //person 객체에 세팅
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);  //생성 객체를 어레이리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;
	}
	
	//1명 조회(상세 보기)
	public Person getPerson(String userId) {
		Person person = new Person();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);  //sql 실행
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();   //데이터 반환받음
			if(rs.next()) {
				person.setUserId(rs.getString("userid"));
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return person;
	}
	
	
	
	
	//자료 수정
	public void updatePerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE person SET userpw = ?, name = ?, age = ? WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();
			}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
	//자료 삭제
	public void deletePerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM person WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
}
