package multithread;

public class Start implements Runnable {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Execution...");
			
		}else {
			System.out.println("Normal Thread Execution...");
		}
	}
    public static void main(String[] args) {
		Start t = new Start();
		Thread t1 = new Thread(t);
		t1.setDaemon(true);
		t1.start();
	}
}
