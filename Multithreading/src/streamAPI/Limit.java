package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Limit {
	public static void main(String[] args) {
		List<String> javacourse = Arrays.asList("corejava","advjava","springboot","restapi","microservices");
		 javacourse.stream().limit(3).forEach(c->System.out.println(c));
		 
		 javacourse.stream().skip(3).forEach(c->System.out.println(c));
		 
		 List<String> names = Arrays.asList("raja","rani","raja","guru");
		 names.stream().distinct().forEach(name->System.out.println(name));
	}

}
