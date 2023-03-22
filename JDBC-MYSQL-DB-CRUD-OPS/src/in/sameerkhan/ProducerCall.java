package in.sameerkhan;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProducerCall {
	
    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String PROCEDURE = "call getBooksData()";
	
	public static void main(String[] args)throws Exception {
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		CallableStatement cstmt = con.prepareCall(PROCEDURE);
		
		ResultSet rs = cstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ rs.getString(2)+ rs.getDouble(3));
		}
		con.close();
	}

}
