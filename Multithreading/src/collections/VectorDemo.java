package collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String>v = new Vector<String>();
		v.add("Mantoo");
		v.add(new String("Sameer"));
		v.add("Kohil");
		v.add("Dhoni");
		v.add("suresh");
		System.out.println(v);
		System.out.println(v.size());
	}

}
