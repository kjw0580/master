package banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banking_db.common.JDBCUtil;

public class AccountDao {
	
	//JDBC 관련 변수 선언
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Scanner scanner = new Scanner(System.in);
	
	//계좌 생성
	public void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			if(findAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력하세요");
			}else {
				System.out.print("계좌주: ");
				String owner = scanner.next();
				while(true) {
					System.out.print("초기입금액: ");
					int balance = scanner.nextInt();
					if(balance < 100) {
						System.out.println("초기 입금액은 100원 이상입니다. 다시 입력하세요");
					}else {
						//db 연동
						try {
							conn = JDBCUtil.getConnection();
							String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, ano);
							pstmt.setString(2, owner);
							pstmt.setInt(3, balance);
							pstmt.executeUpdate();
							System.out.println("결과: 계좌가 생성되었습니다.");
							break;
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
					}
				}//안쪽 while
				break;
			}
		} //바깥쪽 while
	}
	
	
	//목록 보기
	public List<Account> getAccountList(){
		List<Account> accountList = new ArrayList<>();
		
		System.out.println("-------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------------------------------");
		
		//db 연결
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			
			for(int i = 0; i < accountList.size(); i++) {
				Account account = accountList.get(i);
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountList;
	}
	
	
	//계좌 찾기
	private Account findAccount(String ano) {
		Account account = null;
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}
}