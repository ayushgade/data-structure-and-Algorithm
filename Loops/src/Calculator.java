import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter the Opertor:");
            char op = in.next().charAt(0);
            if(op == '+' || op == '-' || op == '*' ||op == '/'){
                System.out.print("Enter First NUmber :");
                int num1 = in.nextInt();
                System.out.print("Enter Second NUmber :");
                int num2 = in.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
            }
            System.out.println("Answer is:" + ans);
        }
    }
}
