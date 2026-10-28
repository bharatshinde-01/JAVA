public class Command {
    public static void main (String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String c = args[2];
        switch (c) {
            case "+":
                System.out.print("Sum = "+ (a + b));
                break;
            case "-":
                System.out.print("Substration = "+ (a - b));
                break;
            case "*":
                System.out.print("Multiplation = "+ (a * b));
                break;
            case "/":
                if(b == 0){
                    System.out.print("Not divisibal by Zero !");
                }
                else {
                System.out.print("Division = "+(a / b));
                }
                break;
            default:
                System.out.print("Invalid Choice !");
                break;
        }
    }
}
