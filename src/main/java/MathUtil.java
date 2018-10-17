public class MathUtil {

    private static String LOCK = "LOCK";

    public static int multiply(int a, int b) {
        synchronized(LOCK) {
            System.out.println(a * b);            
        }
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}
