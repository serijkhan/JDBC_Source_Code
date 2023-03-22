package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sameer","Mantoo","Anuska","Anupama","Ashok");
		
		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
	}

}
