package reflectionAPI;

public class Sameer {
	public static void main(String[] args) {
		Sameer s1 = new Sameer();
		s1 = null;
		System.gc();
		
		Runtime.getRuntime().gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() called...");
		
	}
		
	}

