package serialization;



	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.Serializable;

	public class Person implements Serializable{
		private static final long serialversionuid = -100l;
		int id;
		String name;
		public String Email;
		
		public static void main(String[] args)throws Exception {
			Person p = new Person();
			p.id=100;
			p.name="Sameer";
			System.out.println("=====Serialization Started====");
			
			
			FileOutputStream fos = new FileOutputStream("Person.per");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			oos.flush();
			oos.close();
			
			System.out.println("=====Serialization completed====");
			System.out.println("=====De-Serialization statted===");
			
			FileInputStream fis = new FileInputStream ("Person.per");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			Person p1 = (Person)object;
			System.out.println("id:"+p1.id);
			System.out.println("Name:"+p1.name);
			ois.close();
			System.out.println("======De-Serialization ended====");
			
		}

	}






