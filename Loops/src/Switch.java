import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch(fruit){
            case "Apple" -> System.out.println("apple");
            case "Orange" -> System.out.println("orange");
        }
    }
}
