package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapFilter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("India","usa","uk","japan");
		
		names.stream().map(name->name.toUpperCase()).forEach(n->System.out.println(n));
		
		names.stream().mapToInt(name->name.length()).forEach(i->System.out.println(i));
	}

}
