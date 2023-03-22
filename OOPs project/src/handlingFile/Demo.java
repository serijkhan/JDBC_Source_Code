package handlingFile;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		File f =new File("C;//user//sameer//class//19.jrtp");
		String[] arr = f.list();
		for(String name:arr) {
			System.out.println(name);
	}
	
	}

}
