package exception;

public class Calculator {
	public void add(int...a) {
		int sum =0;
		for (int x:a) {
			sum = sum+x;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.add(10,20);
		c.add(10,20,30);
		c.add(10,20,30,40);
		c.add(10,20,30,40,50);
		c.add(1,2,3,4,5);
	}
		
	}


