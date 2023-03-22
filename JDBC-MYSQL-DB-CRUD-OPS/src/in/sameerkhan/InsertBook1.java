package in.sameerkhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBook1 {
	
    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(103,'DevOps',4000)";
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		Statement stmt = con.createStatement();
		
		int rowsEffected = stmt.executeUpdate(INSERT_SQL);
		
		System.out.println("Records Inserted :" + rowsEffected);
		
		con.close();
		
		
		
		
		
		
		
		
		
	}

}
