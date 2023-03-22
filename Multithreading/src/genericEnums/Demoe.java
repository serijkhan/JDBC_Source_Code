package genericEnums;

public class Demoe<T> {
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
	public static void main(String[] args) throws Exception{
		Demoe<Integer>d1 = new Demoe<>();
		d1.add(10);
		System.out.println(d1.get());
		
		Demoe<String>d2 = new Demoe<>();
		d2.add("hii");
		System.out.println(d2.get());
		
	}

}
