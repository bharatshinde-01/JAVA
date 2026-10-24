import java.util.*;

public class Input {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a , b ;
    //   String c;
      System.out.print("Enter 1st num :");
      a = sc.nextInt();
      System.out.print("Enter 2nd num :");
      b = sc.nextInt();
      int sum = a + b;
      System.out.print("Sum of two num is :"+sum);
    //   System.out.print("Enter name :");
    //   c = sc.nextLine();
      sc.close();
    }
}
