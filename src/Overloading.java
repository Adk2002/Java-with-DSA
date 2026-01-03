class MathOperation{
    //This code is to demonstrate overloading
    public int mulitiply(int a, int b){
        return a*b;
    }
    public double division(double a, double b){
        return a/b;
    }
}
public class Overloading {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println("Multiply: " +m.mulitiply(10, 20));
        System.out.println("Double Division: " +m.division(45.85, 9.38));
    }
}
