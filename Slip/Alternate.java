import java.util.*;
public class Alternate {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.print("Enter your string :");
        str = sc.nextLine();
        for(int i = 0; i <str.length();i++){
            if(i %2 == 0){
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
