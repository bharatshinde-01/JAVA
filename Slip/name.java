import java.util.*;
class name{
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        String newName = name.toUpperCase();
        System.out.print("Hello "+newName+", nice to meet you!");
        sc.close();
    }
}