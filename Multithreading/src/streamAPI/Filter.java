package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sameer","Mantoo","Anushka","Anupama","Ashok");
		
		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
	}

}
