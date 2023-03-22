package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map4 {
	public static void main(String[] args) {
		List<String> javacourse = Arrays.asList("core","java","adv java","Spring boot");
		
		List<String> uicourse = Arrays.asList("html","css","bs","js");
		 List<List<String>> course = Arrays.asList(javacourse,uicourse);
		 Stream<String> fms = course.stream().flatMap(s->s.stream());
		 fms.forEach(c->System.out.println(c));
	}

}
