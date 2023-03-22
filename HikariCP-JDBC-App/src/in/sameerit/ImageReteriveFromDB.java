//package in.sameerit;
//
//import java.io.FileOutputStream;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class ImageReteriveFromDB {
//	
//	public static void main(String[] args)throws Exception {
//		
//		Connection con = ConnectionFactory.getDBConnection();
//		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			byte stream = rs.getByte(2);
//			
//			FileOutputStream fos = FileOutputStream("");
//			fos.write(stream);
//			fos.close();
//		}
//		con.close();
//	}
//
//}
