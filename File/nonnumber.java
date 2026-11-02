package File;
import java.io.*;
public class nonnumber {
    public static void main (String [] args)
    throws Exception{
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("out.txt");
        int ch;
        while((ch =fr.read())!= -1){
            if(ch <'0' || ch >'9'){
                fw.write(ch);
            }
        }
        fr.close();
        fw.close();
        System.out.print("Sussfully run na bro :");
    }
}

// class nonnumber{
//     public static void main (String args[]){
//         char ch = 'A';
//         for (ch = 'A'; ch <='Z';ch++){
//             System.out.print(ch+"  ");
//         }
//     }
// }