package exception;

public class Sameer {
	public static void main(String[] args) {
		System.out.println("main()method started...");
		try {
			System.out.println("try block start");
			String s="hii";
			int i=s.length();
		}
		catch(Exception e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}
		System.out.println("main()method ended...");
		}
	}
//in below scenario catch block will not be excute bcz 
//there is no execption in try block

