package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemoes {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("ashok");
		al.add("it");
		al.add("java");
		al.add("Tranning");
		
		ListIterator<String> listIterator = al.listIterator();
		
		while(listIterator.hasNext());
		String next = listIterator.next();
		System.out.println(next);
	}

}
