class Student{
    String name;
    int age;

    Student(String num, int a){
        name = num;
        age = a;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class ParameterConst {
    public  static void main(String[] args) {
        Student S1 = new Student("Aditya", 23);
        S1.display();
    }
}