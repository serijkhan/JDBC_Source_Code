package hierarchical;

public class Calculator {
	void add(int i,int j) {
		System.out.println("sum from 1 methods:"+(i+j));
	}
	void add(int i,int j,int k) {
		System.out.println("sum from 2 method:"+(i+j+k));
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10,20);
		c.add(10,20,30);
	}
	}


