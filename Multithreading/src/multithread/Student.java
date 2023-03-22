package multithread;

public class Student implements Runnable {
	public synchronized void printNums() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "=>" + i);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		printNums();

	}

	public static void main(String[] args) {
		Student s = new Student();
		Thread t1 = new Thread(s);
		t1.setName("Thread-1");
		t1.start();

		Thread t2 = new Thread(s);
		t2.setName("Thread-2");
		t2.start();
	}
}
