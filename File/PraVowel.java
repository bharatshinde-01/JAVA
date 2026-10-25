//Write a java program to display all the vowels from a given string

import java.util.*;
class PraVowel{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int ch;
        int count = 0;
        System.out.print("Enter your Stirng :");
        str = sc.nextLine();
        System.out.println("Your string is this :"+str);
        for(int i = 0 ; i < str.length();i ++){
            if(str.charAt(i) == 'A'){
                count ++;
            }
        }
        System.out.println("Vowels in String is :"+count);
    }
}