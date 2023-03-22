package streamAPI;

import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		System.out.println("=======Serail Stream======");
		
		Stream<Integer> ss = Stream.of(1,2,3,4,5);
		ss.forEach(n->System.out.println(n+"::"+Thread.currentThread()));
		
		System.out.println("======Parallel Stream=======");
		
		Stream<Integer> ps = Stream.of(1,2,3,4,5);
		ps.parallel().forEach(n->System.out.println(n+"::"+Thread.currentThread()));
		
		
	}

}
