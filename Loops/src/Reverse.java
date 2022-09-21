public class Reverse {
    public static void main(String[] args) {
//        int num = 123236;
//        int ans = 0;
//        while(num > 0){
//            int rem = num % 10;
//            num = num/10;
//            ans = ans *10 + rem;
        int num = 20;
        int s = 0;
        int f =1;
        int i =1;
        while(i<=num){
            f = f*1;
            s = s+(i/f);
            i +=1;
        }
        System.out.println(s);
    }
}
