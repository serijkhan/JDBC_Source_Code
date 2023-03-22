package in.serijkhan;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	
	public static void main(String[] args)throws Exception {
		
		File f = new File("db.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p);
		
		
		
		  String username = p.getProperty("db.username"); String password =
		  p.getProperty("db.password");
		  
		  System.out.println(username); System.out.println(password);
		  
		  fis.close();
		 
		
	}

}
