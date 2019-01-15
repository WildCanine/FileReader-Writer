package b;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileWriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out=new PrintWriter("/home/compsci/eclipse-workspace/textfiles/data.txt");
		for (int i=0; i<=10; i++) {
			out.println(i);
		}
		out.close();
	}
}
