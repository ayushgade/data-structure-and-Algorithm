import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while(count < 2) {
            sum();
            count++;
        }
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("Answer :" + sum);


    }
}
