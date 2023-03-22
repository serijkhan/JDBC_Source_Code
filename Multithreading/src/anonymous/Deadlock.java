package anonymous;

public class Deadlock {
	public static void main(String[] args) {
		
		String s1 ="hii";
		String s2 = "hello";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(s1) {
					System.out.println("Thread -1 locked resourse-1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(s2) {
					System.out.println("Thread-2 locked resourse-2");
				}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(s2) {
					System.out.println("Thread -2 locked resourse-2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(s1) {
					System.out.println("Thread-2 locked resourse-1");
				}
				}
				
			}
		};
		t1.start();
		t2.start();
	}

}
