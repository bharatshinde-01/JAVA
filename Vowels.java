import java.util.*;
public class Vowels{
    public static void main (String [] args )
    throws Exception{
        Scanner sc = new Scanner (System.in);
        String str ;
        int count = 0;
        System.out.print("Enter your string :");
        str = sc.nextLine();
        for(int i = 0 ; i <str.length(); i++){
            if(str.charAt(i) == 'A'|| str.charAt(i) == 'a'||str.charAt(i) == 'e'
            ||str.charAt(i) == 'E'||str.charAt(i) == 'i'||str.charAt(i) == 'I'
            ||str.charAt(i) == 'o'||str.charAt(i) == 'O'||str.charAt(i) == 'u'||
            str.charAt(i) == 'U'){
                count ++;
            }
        }
        System.out.print("Vowels in stringis :"+count);
        sc.close();
    }
}