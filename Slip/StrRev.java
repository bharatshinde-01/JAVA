import java.util.*;
class StrRev{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String rev = " ";
        System.out.print("Enter string to reverse it :");
        String str = sc.nextLine();
        for(int i = str.length()-1; i >= 0; i --){
            rev = rev + str.charAt(i);
        }
        System.out.print("Reverse String is :"+rev);
        sc.close();
    }
}