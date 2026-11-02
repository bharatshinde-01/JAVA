import java.util.*;
class Exe extends Exception{
    Exe(String msg){
        super (msg);
    }
}
public class Age {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        try{
            if( age < 18){
                throw new Exe("Invalid Age !");
            }
            System.out.print("Your ate eligible ");
        }
        catch (Exe e){
            System.out.print(e.getMessage());
        }
        sc.close();
    }
}
