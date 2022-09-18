import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            System.out.println(i);
        }
        // When we don't know how many times loops is going to iterate
        int count = 1;
        while(count <=100){
            System.out.println(count);
            count ++;
        }

        // When we want to run loop atleast once.
            do{
                System.out.println("hello world");
            }while (count ==100);
        }
    }
