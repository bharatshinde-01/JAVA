package File;
import java.io.*;
class FileVowels{
    public static void main(String [] args)
    throws Exception{
        FileReader fr = new FileReader("input.txt");
        int ch;
        int count = 0;
        while((ch = fr.read())!= -1){
            if(ch == 'A'){
                count ++;
            }
        }
        System.out.print("A in file is :"+count);
        fr.close();
    }
}
