package generated.lab2;
import java.io.*;
import java.text.ParseException;
import java.nio.charset.StandardCharsets;
// Main class
 
public class Main {
    public static void main(String[] args) {
        Lab2Parser parser = new Lab2Parser();
		try {
			if (args.length != 0) {
				try {
					parser.parse(new ByteArrayInputStream(args[0].getBytes(StandardCharsets.UTF_8.name())));
				} catch (UnsupportedEncodingException e) {
					System.err.println(e.getMessage());
					System.exit(1);
				}
			} else {
				try {
					InputStream input = new FileInputStream(new File("inputs/lab2_input.txt"));
					parser.parse(input);
                } catch (FileNotFoundException e) {
                    System.err.println(e.getMessage());
                    System.exit(1);
                }
            }
        } catch (ParseException e) {
            System.err.println("Parser failed: \nCause: " + e.getMessage() + e.getErrorOffset());
            System.exit(1);
        }
    }
}
