package com.shameer;
public class Calculator1 {
	void add(int i,int j) {
		System.out.println("Sum from 1 method:"+(i+j));
	}
	void add(int i,int j,int k) {
		System.out.println("Sum from 2 method:"+(i+j+k));
	}
	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		c.add(10,20);
		c.add(10,20,30);
	}
	}


