package functionInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
	Consumer<String> c =(name)-> System.out.println(name+",Good Evening");
		c.accept("Sameer");
		c.accept("Mantoo");
		c.accept("Rani");
		
		List<Integer> numbers= Arrays.asList(10,20,30,40);
		numbers.forEach(i-> System.out.println(i));
	}

}
