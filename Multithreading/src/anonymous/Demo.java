package anonymous;

public class Demo {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
			for(int i = 1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName()+"-"+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
 					e.printStackTrace();
				}
			}
			}
			
		};
		t1.setName("Thread-1");
	    t1.start();
	    
		Thread t2 = new Thread() {
			@Override
			public void run() {
			for(int i = 1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName()+"-"+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
 					e.printStackTrace();
				}
			}
			}
			
		};
		t2.setName("Thread-2");
	    t2.start();
		}
}


