public class Constructor_Chaining {
    public static void main(String args[]){
        Student sb=new Student();
        System.out.println(sb.name+" "+sb.age+" ");
    }
}
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0);  // Calls the parameterized constructor
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        this(10,20);
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }
    Student(int a, int b){
        
        System.out.println(a+b);
    }
}

