import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(armstrong(n));
        for (int i = 10; i < 10000 ; i++) {
            if(armstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean armstrong(int n) {
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return original == sum;
    }
}
