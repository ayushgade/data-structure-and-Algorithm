import java.util.Arrays;

public class VariableLengthArug {
    public static void main(String[] args) {
        fun(1,23,34,34,45,23);
    }
        static void fun(int ...v){
            System.out.println(Arrays.toString(v));
        }
    }

