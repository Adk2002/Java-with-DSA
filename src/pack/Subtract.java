package pack;

public class Subtract{
    private double S1, S2;
    public Subtract(double a, double b){
        S1 = a;
        S2 = b;
    }
    public void display(){
        System.out.println("Subtraction = " + Math.round(S1 - S2));
    }

}