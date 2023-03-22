package comparableComoarator;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("Sameer");
		sj1.add("khan");
		sj1.add("Java");
		System.out.println(sj1);
		
		
		StringJoiner sj2 = new StringJoiner("-","(",")");
		sj2.add("Ashok");
		sj2.add("it");
		sj2.add("java");
		System.out.println(sj2);
		
	}

}
