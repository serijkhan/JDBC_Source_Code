package in.sameerkhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmp {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "mantookhan@123";

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Dept :: ");
		String dept = s.next();

		System.out.println("Enter Location :: ");
		String workLocation = s.next();

		System.out.println("Enter Gender :: ");
		String gender = s.next();

		StringBuilder sql = new StringBuilder("SELECT * FROM EMPLOYEE WHERE 1=1 ");

		if (dept != null && !dept.equals("null")) {
			sql.append("AND EMP_DEPT = ?");
		}

		if (workLocation != null && !workLocation.equals("null")) {
			sql.append("AND WORK_LOCATION = ?");
		}

		if (gender != null && !gender.equals("null")) {
			sql.append("AND EMP_GENDER = ?");
		}

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		PreparedStatement pstmt = con.prepareStatement(sql.toString());

		int index = 1;
		
		if (dept != null && !dept.equals("null")) {
			pstmt.setString(index, dept);
			index++;
		}
		if (workLocation != null && !workLocation.equals("null")) {
			pstmt.setString(index, workLocation);
			index++;
		}
		if (gender != null && !gender.equals("null")) {
			pstmt.setString(index, gender);
		}

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3) + "--" + rs.getString(4)
					+ "--" + rs.getString(5) + "--" + rs.getString(6));

		}

		con.close();
	}

}
