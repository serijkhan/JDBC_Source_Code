package in.sameerkhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmpHike {
	
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String SELECT_SQL = "SELECT * FROM EMPLOYEE";
	
	private static final String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY +(EMP_SALARY * ?)/100";
	
	public static void main(String[] args)throws Exception {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Emp Hike");
		double hike =s.nextDouble();
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		 String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY +(EMP_SALARY * ?)/100";
		
		PreparedStatement pstmt = con.prepareStatement(UPDATE_SAL_SQL);
		pstmt.setDouble(1, hike);
		pstmt.executeUpdate();
		
		System.out.println("Update complete....");
		con.close();
		
		
		
	}

}
