// Abstract class - cannot be instantiated directly
abstract class MyClass {
    // Abstract method - no implementation, ends with semicolon
    abstract void calculate(double x);
}

// Concrete subclass that extends the abstract class
class Sub1 extends MyClass {
    // Must implement all abstract methods from parent class
    void calculate(double x) {
        System.out.println("Square Root = " + Math.sqrt(x));
    }
}

// Another example subclass
class Sub2 extends MyClass {
    void calculate(double x) {
        System.out.println("Square = " + (x * x));
    }
}

public class abstractClass {
    public static void main(String[] args) {
        // Create object using subclass
        MyClass myClass1 = new Sub1();
        myClass1.calculate(16);

        MyClass myClass2 = new Sub2();
        myClass2.calculate(5);
    }
}