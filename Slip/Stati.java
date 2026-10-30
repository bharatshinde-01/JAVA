package Slip;
import java.util.*;
public class Stati {

     static void check(int n){
           // n = 12345;
           int temp = n;
           int sum = 0;
           while (temp > 0){
            int digit = temp % 10;
            sum = sum + digit * digit * digit ;
            temp = temp / 10;
           }
           if(sum ==n){
            System.out.print("Yes this is a Armstrong number :"+sum);
           }
           else {
            System.out.print("This is not a armstrong number :"+n);
           }
        }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number to check :");
        n = sc.nextInt();
     Stati obj = new Stati();
     obj.check(n);
     sc.close();
    }
}
