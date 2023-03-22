package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoe {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(25);
		v.add(10);
		v.add(36);
		v.add(98);
		v.add(25);
		v.add(24);
		v.add(56);
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements());
		System.out.println(e.nextElement()+" ");
	}

}
