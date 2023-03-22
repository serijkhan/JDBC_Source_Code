package in.sameerkhan;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBook {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(102,'HTML',5632)";
	
	public static void main(String[] args)throws Exception {
		
		// Step 1 :load Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		//Step 2: Get DB Connection
		
		Connection con =DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
		
		System.out.println(con);
		
		//Step 3 : Create the statement
		
		Statement stmt =con.createStatement();
		// step 4 : Execute result
		int rowsEffected = stmt.executeUpdate(INSERT_SQL);
		
		// step 5: Process Result
		
		System.out.println("Record Inserted count::"+ rowsEffected);
		
		// step 6: close Connection
		
		con.close();
		
		
		
		
		
	}

}
