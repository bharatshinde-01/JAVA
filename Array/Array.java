package Array;
import java.util.*;
class Array {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        System.out.print("Enter how many numbers :");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter numbers :");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.print("Reverse order :");
        for(int i = list.size() -1; i >= 0;  i --){
            System.out.print(list.get(i));
        }
        sc.close();
    }
}