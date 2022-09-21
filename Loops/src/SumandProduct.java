public class SumandProduct {
    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        int sum = 0;
        int product = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum * rem;
            count++;
            num = num/10;
        }
        System.out.println(sum);
    }
}
