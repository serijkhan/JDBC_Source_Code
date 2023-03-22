package exception;

public class Demoe {
	{
		System.out.println("I am from instance block");
	}
	public Demoe() {
		System.out.println("I am from constructor");
	}
		
		static {
			System.out.println("I am from static block");
		}
	
	public static void main(String[] args) {
		System.out.println("I am from main methods");
		Demoe d= new Demoe();
	}
		
	}


