//package comparableComoarator;
//import java.util.Scanner;
//public class MsgService {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Enter User ID");
//		int userId = s.nextInt();
//		
//		User u = new User();
//		Optical<String> username = u.getUsernameById(userId);
//		if(username.isPresent()) {
//			String name = username.get();
//			System.out.println(name.toUpperCase()+",Hello");
//		}else {
//			System.out.println("No Data Found");
//		}
//	}
//
//}
