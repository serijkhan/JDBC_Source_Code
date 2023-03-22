package anonymous;

public class Yield {
	public static void main(String[] args) {
		Thread producer = new Producer();
		Thread consumer = new Consumer();
		
		producer.start();
		consumer.start();
	}
}

class Producer extends Thread{
	@Override
	public void run() {
     for(int i= 0; i<=3;i++) {
    	 System.out.println("Producer:Producer Item"+i);
    	 Thread.yield();
     }
	}
}

class Consumer extends Thread{
	@Override
	public void run() {
	
		for(int i =0; i<=3;i++) {
			System.out.println("Consumer:Consumer Item"+i);
			Thread.yield();
		}
	}
}
