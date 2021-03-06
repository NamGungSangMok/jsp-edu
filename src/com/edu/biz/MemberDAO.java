package com.edu.biz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.edu.beans.Member;

public class MemberDAO {
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.151:1521:SWSPROD", "cc", "cc");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public void insertMember(Member member) {
		try {
			Connection conn = this.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement("insert into test_member values(?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPwd());
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}


