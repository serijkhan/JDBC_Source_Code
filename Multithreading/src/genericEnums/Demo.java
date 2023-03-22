package genericEnums;

public class Demo<T> {
	
	public void m1(T arg) {
		System.out.println("Param Recived:"+arg);
	}
	public static void main(String[] args) throws Exception{
		Demo d = new Demo();
		d.m1(10);
		
		d.m1("hii");
		
		d.m1(100.52);
		d.m1(true);
		
		
	}

}
