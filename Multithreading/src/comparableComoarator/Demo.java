package comparableComoarator;

import java.util.StringTokenizer;

public class Demo {
	private static String i;

	public static void main(String[] args) throws Exception{
		String a =":";
		String b = "Welcome:to:ashokit : . : How: are: You:?";
		StringTokenizer c = new StringTokenizer(b,a);	
		int count1 = c.countTokens();
		
		for(int i =0; i<count1;i++);
		System.out.println("token["+i+"]:"+c.nextToken());
		StringTokenizer d = null;
		
		while(c.hasMoreTokens()) {
			System.out.println(d.nextToken());
		}
		
	}

}
