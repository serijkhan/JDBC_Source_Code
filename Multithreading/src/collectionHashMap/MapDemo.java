package collectionHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(11, "Sameer");
		hm.put(25, "Mantoo");
		hm.put(12, "Shamsul");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		Set<Integer> ks = hm.keySet();
		System.out.println(ks);
		
		
		Collection<String> cv = hm.values();
		System.out.println(cv);
		
		Set<?> entry = hm.entrySet();
		System.out.println(entry);
		
		System.out.println(hm.containsKey(12));
		System.out.println(hm);
	}

}
