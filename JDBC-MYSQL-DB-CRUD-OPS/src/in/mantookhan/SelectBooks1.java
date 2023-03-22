package in.mantookhan;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBooks1 {
	
    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String PRODUCER = "call getBookById(?)";
	
	public static void main(String[] args)throws Exception {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book Id");
		int bookId = s.nextInt();
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		CallableStatement cstmt = con.prepareCall(PRODUCER);
		cstmt.setInt(1, bookId);
		
		ResultSet rs = cstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) +"--"+ rs.getString(2)+"--"+ rs.getDouble(3));
		}
		con.close();
		
		
	}
}
