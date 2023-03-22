package in.sameerkhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Books {
	    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
		
		private static final String DB_UNAME="root";
		
		private static final String DB_PWD="mantookhan@123";
		
		private static final String INSERT_SQL ="INSERT INTO BOOKS VALUES(?,?,?)";
		
		public static void main(String[] args)throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
			
			PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
			
			pstmt.setInt(1, 104);
			pstmt.setString(2, "Gcp");
			pstmt.setDouble(3, 3250.00);
			
			int count = pstmt.executeUpdate();
			System.out.println("Rows Effected::"+count);
			
			con.close();
			
		}

}
