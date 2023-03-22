package mutlithreading;

import java.io.PrintWriter;

public class Demo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.print("hi");
		pw.println("hello");
		pw.flush();
		pw.close();
	}

}
