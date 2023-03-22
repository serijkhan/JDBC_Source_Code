package comparableComoarator;

import java.util.ArrayList;
import java.util.Collections;
public class NumberSort2 {
	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(8);
		al.add(1);
		al.add(2);
		
		System.out.println("Before Sort::"+al);
		
		//Collections.sort(al,(i,j)) -> (i>j) ? -1:1);
		
		System.out.println("After Sort ::"+al);
	}

}
