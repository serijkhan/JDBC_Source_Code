package exception;


public class Demo {
	public String getName (int id) throws Exception{
		if(id==100) {
			return"Sameer";
		}else if(id==101) {
			return"Mantoo";
		}else {
			throw new Exception ("Invalid id");
		}
	}
	public static void main(String[]args)throws Exception {
		Demo d=new Demo();
		String name=d.getName(101);
		System.out.println(name);
		
		String name1=d.getName(200);
		System.out.println(name1);
		
		
		
		}
	}


