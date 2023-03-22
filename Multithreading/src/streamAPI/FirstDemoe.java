package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemoe {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(66,32,45,12,20);
		Stream<Integer> stream = list.stream();
		
		Stream<Integer> filteredstrem = stream.filter(i-> i > 20);
		
		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
	}

}
