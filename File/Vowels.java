//  Write a java program to display all the vowels from a given string.

package File;
import java.io.*;
class Vowels{
    public static void main (String [] args)
    throws Exception {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        int ch;
        int count = 0 ;
        while((ch = fr.read()) != -1){
            if(ch == 'i' || ch == 'I'|| ch == 'a' || ch == 'A'||ch == 'e' || ch == 'E' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U'
            ){
                count++;
            }
        }
        fr.close();
        fw.close();
        System.out.print("Vowels in this file is :"+count);
    }
}