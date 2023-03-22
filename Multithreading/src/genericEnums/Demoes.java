package genericEnums;

public class Demoes<T1,T2> {
	T1 obj1;
	T2 obj2;
	
	Demoes(T1 obj1,T2 obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
	}
	 void print() {
		 System.out.println(obj1+" "+obj2);
		 
	 }
	public static void main(String[] args) throws Exception{
		Demoes<Integer,String>d1 = new Demoes<>(101,"Sameer");
		d1.print();
		
		Demoes<String,Long>d2 = new Demoes<>("Sameer",7007662526l);
		d2.print();
		
		Demoes<String,Boolean>d3 = new Demoes<>("Raju",true);
		d3.print();
	
		
	}
	
	}
		