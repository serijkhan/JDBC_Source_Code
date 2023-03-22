package mutlithreading;
import java.io.PrintWriter;
public class Demoes {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("f1.txt");
		pw.write("This is my f1 file data");
		pw.flush();
		pw.close();
		
	}

}
