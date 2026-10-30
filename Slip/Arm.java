package Slip;
import java.util.*;
public class Arm{
    static void Check (int n ){
        int temp = n;
        int sum = 0;
        while (temp  > 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }
        if ( sum == n){
            System.out.print("Yes this is armstrong number :"+sum);
        }
        else {
            System.out.print("This is not a Armstorng number :"+n);
        }
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int a ;
        System.out.print("Enter your number to check :");
        a = sc.nextInt();
        Arm b = new Arm();
        b.Check(a);
        sc.close();
    }
}