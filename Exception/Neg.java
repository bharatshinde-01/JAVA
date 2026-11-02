import java.util.*;
class Exe extends Exception{
    Exe(String msg){
        super (msg);
    }
}
class Neg{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        try {
            if ( num < 0){
                throw new Exe("Negative numbers not allowed !");
            }
            System.out.print("Square = "+(num * num));
        }
        catch (Exe e){
            System.out.print(e.getMessage());
        }
    }
}