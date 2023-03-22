

public class Demo implements Runnable  {

public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Execution...");
			
		}else {
			System.out.println("Normal Thread Execution...");
		}
	}
    public static void main(String[] args) {
		Demo t = new Demo();
		Thread t1 = new Thread(t);
		t1.setDaemon(true);
		t1.start();
	}
}
