
import java.io.*;

class CopyData {
    public static void main(String[] args) {
        try (
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt")
        ) {
            int ch;

            while ((ch = fr.read()) != -1) {
                if (!Character.isDigit((char) ch)) {
                    fw.write(ch);
                }
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
