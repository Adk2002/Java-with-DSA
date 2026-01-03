import java.util.Vector;

public class VectorArr {
    public static void main(String[] args) {
        // ----------- Working with Arrays -----------
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // ----------- Working with Vectors -----------
        Vector<String> vec = new Vector<String>();

        // Adding elements to Vector
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Cherry");
        vec.add("Chicken");

        System.out.println("\nVector Elements:");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println("vec[" + i + "] = " + vec.get(i));
        }

        // Demonstrating dynamic nature of Vector
        vec.add("and Most importantly  the Pork..!");
        System.out.println("\nAfter adding :");
        for (String fruit : vec) {
            System.out.println(fruit);
        }
    }
}