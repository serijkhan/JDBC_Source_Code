package comparableComoarator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args)throws IOException {
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);
		System.out.println(p);
		
	}

}
