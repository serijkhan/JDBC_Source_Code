package comparableComoarator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumbersSort1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(9);
		al.add(3);
		al.add(2);
		
		System.out.println("Before Sort::"+al);
		
		Collections.sort(al,new NumberComparator());
		
		System.out.println("After Sort::"+al);
	}

}
class NumberComparator implements Comparator<Integer>{
	public int compare(Integer i, Integer j) {
		if(i>j) {
			return 1;
		}else if(i<j) {
			return -1;
		}
		return 0;
			
		}
	}
