package comparableComoarator;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put("Sameer", 200);
		ht.put("Mantoo", 265);
		ht.put("ashish", 365);
		ht.put("ashok", 259);
		ht.put("Shamsul", 859);
		System.out.println(ht);
		
		Enumeration e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
