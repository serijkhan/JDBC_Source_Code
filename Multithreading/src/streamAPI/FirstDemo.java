package streamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Sameer");
		names.add("Mantoo");
		names.add("Shamsul");
		
		
		Stream<String> stream2 = names.stream();
		
		
	}
	

}
