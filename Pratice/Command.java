// Write a Java program that accepts two numbers and an operator (+, -, *, /, %)
//  through command line arguments and performs the specified arithmetic
//  operation



public class Command{
    public static void main (String args[]){
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [2]);
        String c = args[1];
        switch (c){
            case "+":
                System.out.print("Sum of two num is :"+(a+b));
                break;
            case "-":
                System.out.print("Substration of two num is :"+(a-b));
                break;
            case "/":
                if( b == 0){
                    System.out.print("Not divisiable By Zero !");
                }
                else {
                    System.out.print("Division by two num is :"+(a / b ));
                }
                break;
                case "*":
                    System.out.print("Multiplaction of two numbers is :"+(a * b ));
                    break;
                case "%":
                    System.out.print("Modulus of two numbers is :"+ (a %b ));
                    break;
                default:{
                    System.out.print("Invalid operator !");
                }
        }
    }
}
