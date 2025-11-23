import pack.Addition;
import pack.Subtract;
class MainAddition {
    public static void main(String[] args) {
        Addition obj = new Addition(12, 56.78);
        obj.sum();

        Subtract obj2 = new Subtract(78, 85.78);
        obj2.display();


    }
}