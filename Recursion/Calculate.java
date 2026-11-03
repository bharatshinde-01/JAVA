import java.util.*;

class Calculate {
    static int Cal(int base , int exp){
        if ( exp == 0){
            return 1;
        }
        return base * Cal(base,exp -1);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter base :");
        int base = sc.nextInt();
        System.out.print("Enter exponet :");
        int exp = sc.nextInt();
        System.out.println("power "+ Cal(base ,exp));
        sc.close();
    }
}