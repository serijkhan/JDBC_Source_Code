package in.mantookhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchOperation {
	
	    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
		
		private static final String DB_UNAME="root";
		
		private static final String DB_PWD="mantookhan@123";
		
		public static void main(String[] args)throws Exception {
			
			Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
			Statement stmt = con.createStatement();
			
			stmt.addBatch("INSERT INTO BOOKS VALUES(105,'AI',28000.00)");
			stmt.addBatch("INSERT INTO BOOKS VALUES(106,'ML',38000.00)");
			stmt.addBatch("INSERT INTO BOOKS VALUES(107,'DS',88000.00)");
			
			int[] count = stmt.executeBatch();
			
			for(int i : count) {
				System.out.println("Record Effected ::" + count.length);
			}
			con.close();
			
			System.out.println("Execution Completed...");
			
		}

}
