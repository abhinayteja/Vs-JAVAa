public class FunctionOverload {
    public static void main(String[] args) {
        fun(9);
        fun("Hello bro!!");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String nae){
        System.out.println(nae);
    }
}
