package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoe {
	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<>();
		al.add("Mantoo");
		al.add("khan");
		al.add("java");
		al.add("training");
		
		Iterator<String> iterator = al.iterator();
		
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		
	}

}
