package File;
import java.io.*;
class CopyF{
    public static void main (String [] args)
    throws Exception {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        int ch;
        while((ch = fr.read())!= -1){
            if(ch <'0' || ch >'9'){
                fw.write(ch);
            }
        }
        fr.close();
        fw.close();
        System.out.print("Sussfully run ");

    }
}