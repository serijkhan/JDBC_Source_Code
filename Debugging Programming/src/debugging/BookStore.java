package debugging;



public class BookStore {
	
	public static void main(String[] args) {
		
		BookStore b = new BookStore();
		int sum= b.sum(10, 20);
		System.out.println(sum);
		
		
		Calculater c= new Calculater();
		int result = c.multiple(2, 2);
		System.out.println(result);
		
	}
	
	public int sum(int a, int b) {
		int sum = a+b;
		
		return sum;
	}
}
