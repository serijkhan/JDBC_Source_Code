package demo;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static void main(String[] args)throws Exception {
		String pwd = "sameer@123";
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pwd.getBytes());
		String encrypted = new String(digest);
		System.out.println("Encrytped::"+encrypted);
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(digest);
		//System.out.println("Encrtyped + Encoded::" new String(encode));
		
	}
}
		
		
		/*Encoder encoder = Base64.getEncoder();
		
		byte[]encode = encoder.encode(pwd.getBytes());
		String encodedpwd = new String(encode);
		System.out.println(encodedpwd);
		
		
		Decoder decoder = Base64.getDecoder();
		byte[]decode = decoder.decode(encodedpwd);
		String decodedpwd = new String(decode);
		System.out.println(decodedpwd);
		
		
		
	}

}*/
