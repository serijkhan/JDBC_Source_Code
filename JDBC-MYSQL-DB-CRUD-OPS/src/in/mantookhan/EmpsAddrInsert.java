package in.mantookhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpsAddrInsert {
	
    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String EMP_INSERT = "INSERT INTO EMPS VALUES(?,?,?)";
	
	private static final String EMP_ADDR_INSERT = "INSERT INTO EMPS_ADDRESS VALUES(?,?,?,?)";
	
	public static void main(String[] args)throws Exception {
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		con.setAutoCommit(false);
		try {
			PreparedStatement pstmt = con.prepareStatement(EMP_INSERT);
			pstmt.setInt(1, 104);
			pstmt.setString(2, "Mantoo");
			pstmt.setDouble(3, 10000.00);
			
			pstmt.executeUpdate();
			
		    pstmt = con.prepareStatement(EMP_ADDR_INSERT);
		    pstmt.setString(1, "Japan");
		    pstmt.setString(2, "MG");
		    pstmt.setString(3, "Asia");
		    pstmt.setInt(4, 104);
		    
		    pstmt.executeUpdate();
		    
		    con.commit();
		    System.out.println("Records Inserted...");
		    
		}catch(Exception e) {
			System.out.println("Transcation Rolled Back....");
			con.rollback();
			
		}
		
	    con.close();
	    
	    System.out.println("Records Inserted...");
	}
}



