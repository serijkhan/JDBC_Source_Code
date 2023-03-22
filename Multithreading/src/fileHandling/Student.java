package fileHandling;

import java.io.File;
import java.io.IOException;


public class Student {
	public static void main(String[] args)throws IOException {
		File f = new File("Sameerit.txt");
		boolean fstatus = f.createNewFile();
		System.out.println(fstatus);
		
		File f1 = new File("Java.txt");
		boolean f1status = f1.createNewFile();
		System.out.println(f1status);
		
		File f2 = new File("mantoo.txt");
		boolean f2status = f2.mkdir();
		System.out.println(f2status);
		
		File f3 = new File("Sameer.txt");
		f3.mkdir();
		
		File f4 = new File("text,txt");
		f4. createNewFile();
		
	}

}
