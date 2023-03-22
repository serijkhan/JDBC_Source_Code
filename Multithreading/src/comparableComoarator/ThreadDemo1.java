package comparableComoarator;

public class ThreadDemo1 implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();
		Thread t = new Thread(td);
		t.start();
	}

}
