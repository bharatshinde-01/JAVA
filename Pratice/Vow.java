import java.util.*;
class Vow {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String str;
        int count = 0;
        System.out.print("Enter your string :");
        str = sc.nextLine();
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'a'){
                count ++;
            }
        }
        sc.close();
        System.out.print("Vowels in String is :"+count);
    }
}
