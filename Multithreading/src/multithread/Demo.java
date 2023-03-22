package multithread;



public class Demo implements Runnable{
	public void run() {
		System.out.println("run()method stated...");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	
			System.out.println("run()method ended...");
	}
	
		public static void main(String[] args) {
			Demo d= new Demo();
			Thread t = new Thread(d);
			t.start();
			t.run();
		}
	}
	


