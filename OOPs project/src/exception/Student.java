package exception;

public class Student {
	public static void main(String[] args) {
		System.out.println("main()method started...");
		try {
			System.out.println("try block start");
			String s=null;
			s.length();
			System.out.println("try block end");
		}
		catch(Exception e) {
			System.out.println("in catch block ");
			e.printStackTrace();
		}
		System.out.println("main()method ended");
			
		}
			
		
		
	}


