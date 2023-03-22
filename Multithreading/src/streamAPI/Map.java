package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Map {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashok","Anil","Akash","Amjad","Sameer","Mantoo");
		
		names.stream().filter(name->name.startsWith("A")).map(name->name+"--"+name.length())
		.forEach(name->System.out.println(name));
	}

}
