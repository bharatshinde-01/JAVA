import java.util.*;
public class Positive {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.print("Enter number to check is positev , Negative or Zero  :");
        a = sc.nextInt();
        if(a > 0) {
            System.out.print("This is a positive number :"+a);
        }
        
        else {
            if (a < 0){
                System.out.print("This is a Negative numbers :"+a);
            }
            else {
                System.out.print("Thsi is a Zero :"+a);
            }
        }
        sc.close();
    }
}
