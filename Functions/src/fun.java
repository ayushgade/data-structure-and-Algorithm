public class fun {
    public static void main(String[] args) {
        // Pass by value
        int ans = sum(10,20);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
