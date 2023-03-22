package in.sameerkhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmpHike2 {
    private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	
	private static final String DB_UNAME="root";
	
	private static final String DB_PWD="mantookhan@123";
	
	private static final String SELECT_SQL = "SELECT * FROM EMPLOYEE";
	
	private static final String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY +(EMP_SALARY * ?)/100";
	
	public static void main(String[] args)throws Exception {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Emp Hike for HR Dept ::");
		double hrDeptHike = s.nextDouble();
		
		System.out.println("Enter Emp Hike for Sales Dept ::");
		double salesDeptHike = s.nextDouble();
		
		System.out.println("Enter Emp Hike for Admin Dept ::");
		double adminDeptHike = s.nextDouble();
		
		System.out.println("Enter Emp Hike Security Dept ::");
		double securityDeptHike = s.nextDouble();
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY = EMP_SALARY +(EMP_SALARY * ?)/100 WHERE EMP_DEPT = ?";
		
		PreparedStatement pstmt = con.prepareStatement(UPDATE_SAL_SQL);
		
			pstmt.setDouble(1, hrDeptHike);
			pstmt.setString(2, "HR");
			pstmt.executeUpdate();
			
			pstmt.setDouble(1, adminDeptHike);
			pstmt.setString(2, "Admin");
			pstmt.executeUpdate();
			
			pstmt.setDouble(1, salesDeptHike);
			pstmt.setString(2, "Sales");
			pstmt.executeUpdate();
			
			pstmt.setDouble(1, securityDeptHike);
			pstmt.setString(2, "security");
			pstmt.executeUpdate();
		
		System.out.println("Update complete....");
		con.close();
		
		
		
	}
	

}
