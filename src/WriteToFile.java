import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row1");
        pw.println("Test row2");

        pw.close();
    }
}
