package com.callor.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.callor.db.service.DBContract;

public class OracleEx_01 {
	public static void main(String[] args) {
		
		System.out.println("Hello Oracle");
		System.out.println("JdvcDriver : " + DBContract.DB_INFO.JdbcDriver);
		
		System.out.println("URL : " + DBContract.DB_INFO.URL);
		System.out.println("User : " + DBContract.DB_INFO.USER);
		System.out.println("PASSWORD : " + DBContract.DB_INFO.PASSWORD);
		
		Connection dbConn = null ;
		
		// JdbcDriver 실행
		try {
			Class.forName(DBContract.DB_INFO.JdbcDriver);

			// JDBC Driver을 통하여 Oracle 서버에 접속해달라
			// 접속이 성공하면 그 정보를 dbConn에 담아달라
			dbConn = DriverManager.getConnection(DBContract.DB_INFO.URL,
					DBContract.DB_INFO.USER,
					DBContract.DB_INFO.PASSWORD) ;
			
			System.out.println("Oracle 연결 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 없음");
		} catch (SQLException e) {
			e.printStackTrace();
		} // 연결 완료
		
		System.out.println();
		
		
		PreparedStatement pStr = null ;
		String sql = "SELECT * FROM tbl_iolist" ;
		try {
			pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString(1));
			}
			
			result.close();
			dbConn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}
}
