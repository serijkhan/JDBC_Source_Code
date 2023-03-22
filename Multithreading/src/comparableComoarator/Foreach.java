package comparableComoarator;

import java.util.ArrayList;

public class Foreach {
	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(3);
		al.add(8);
		al.add(7);
		
		al.forEach(d-> System.out.println(d));
	}

}
