package fileHandling;

import java.io.File;
import java.io.IOException;
public class Mantoo {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\");
		String [] arr = f.list();
		for (String name:arr);
		System.out.println("name");
	}

}
