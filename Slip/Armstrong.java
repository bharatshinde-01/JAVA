package Slip;
import java.util.*;
public class Armstrong {
    static void Arm (int n){
        int temp = n ;
        int sum = 0;
        while(temp > 0){
            int dig = temp % 10;
            sum = sum +dig * dig * dig;
            temp = temp / 10;
        }
        if (sum == n){
            System.out.print("Yes this is Armstrong number :"+sum);

        }
        else{
            System.out.print("This is NOt an Armstorng number :"+n);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter a number :");
        num = sc.nextInt();
        Armstrong obj = new Armstrong();
        obj.Arm(num);
        sc.close();
    }
}
