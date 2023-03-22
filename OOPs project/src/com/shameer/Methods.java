package com.shameer;
import java.util.Arrays;

public class Methods {
public static void main(String[] args) {
	
	Methods m = new Methods();
	int[] ar = {1,2,3};
	m.print(ar);
	
	m.fullname("ashok","it");
}
    void fullname
(String fname,String iname) {
    	String name = fname+iname;
    	System.out.println(name);
    }
        void print(int[] arr) {
        	System.out.println(Arrays.toString(arr));
        }
    }

