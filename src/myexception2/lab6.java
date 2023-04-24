package myexception2;

/**
 *
 * @author dol
 */
public class lab6 {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            // System.out.println(e.toString());
            StackTraceElement[] s = e.getStackTrace();
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i].getClassName());
                System.out.println(s[i].getMethodName());
                System.out.println(s[i].getFileName());
                System.out.println(s[i].getLineNumber());
            }
        }
    }
}
