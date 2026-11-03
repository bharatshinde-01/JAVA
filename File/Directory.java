package File;
import java.util.*;
import java.io.*;

public class Directory {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter directory path :");
        String path = sc.nextLine();
        File f = new File(path);
        if(f.exists() && f.isDirectory() ) {
            File files[] = f.listFiles();
            System.out.print("Text files :");
            for(File file : files){
                if(file.isFile() && file.getName().endsWith(".txt")){
                    System.out.print(file.getName()+"  \n");
                }
            }
            
        }
        else {
                System.out.print("Invalid directory !");
            }
            sc.close();
    }
}
