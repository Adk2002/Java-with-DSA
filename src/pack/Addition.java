package pack;

public class Addition {
    private double d1, d2;

    public Addition(double a, double b) {
        d1 = a;
        d2 = b;
    }

    public void sum() {
        // Use parentheses to actually add the numbers
        System.out.println("Sum is: " + (d1 + d2));
    }
}