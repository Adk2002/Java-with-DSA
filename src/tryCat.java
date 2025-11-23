import java.io.*;

class Ex {
    public static void main(String args[]) {
        try {
            System.out.println("Open Files");
            int n = args.length;   // number of command-line arguments
            System.out.println("n = " + n);

            int a = 4 / n;        // may cause ArithmeticException if n = 0
            System.out.println("a = " + a);
        }
        catch (ArithmeticException ae) {
            System.out.println("Exception: " + ae);
            System.out.println("Please pass data while running this program");
        }
        finally {
            System.out.println("Close Files");
        }
    }
}