import java.util.Arrays;

public class FnArr {
    public static void main(String[] args) {
        // variables as the  parameters 
        fun(1,23,4,5,5,6,5,4,3);

    }
    static void  fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
