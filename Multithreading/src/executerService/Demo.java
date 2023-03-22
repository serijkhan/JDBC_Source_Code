package executerService;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo implements Callable{

	private static ExecutorService exServise;
	@Override
	public Object call() throws Exception {
		System.out.println("call()-methods executed...");
		return "success";
	}
	public static void main(String[] args)throws Exception {
		Demo d = new Demo();
		ExecutorService exService = Executors.newFixedThreadPool(10);
		
		for(int i=1; i<=15; i++) {
			
			Future submit = exServise.submit(d);
			System.out.println(submit.get().toString());
		}
		exService.shutdown();
	}
		
	
	}
	
	