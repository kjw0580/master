package com.cloud.common;

import java.sql.Connection;

public class JDBCTest {

	public static void main(String[] args) {
		Connection conn = JDBCUtil.getConnention();
		System.out.println(conn + " 연결 완료");
	}

}
