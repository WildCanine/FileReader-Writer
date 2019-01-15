package b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReader {
	public static void main(String[] args) throws FileNotFoundException {
		File inFile=new File("/home/compsci/eclipse-workspace/textfiles/data.txt");
		Scanner in=new Scanner(inFile);
		int i=0;
		while(in.hasNextLine()) {
			String line=in.nextLine();
			System.out.println(i+": "+line);
			i++;
		}
		in.close();
	}
}
