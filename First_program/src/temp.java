import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the tempt :");
        float temp = input.nextFloat();
        float in_celcius = (temp * 9/5) +32;
        System.out.println("Temp in celcius is:" + in_celcius);
    }
}
