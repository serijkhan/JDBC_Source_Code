package collectionHashMap;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(27);
		hs.add(12);
		hs.add(null);
		hs.add(9);
		hs.add(21);
		System.out.println(hs.size());
		for(Integer e : hs) {
			System.out.println(e);
		}
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
