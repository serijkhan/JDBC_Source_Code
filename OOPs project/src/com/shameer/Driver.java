package com.shameer;
public class Driver {
public static void main(String[] args) {
	Driver d = new Driver();
	
	int x = d.add(10,20);
	System.out.println(x);
}
int add(int a,int b) {
	int c = a + b;
	return c;
}
}
