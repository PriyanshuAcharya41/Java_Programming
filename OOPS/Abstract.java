public class Abstract {
    public static void main(String args[]){
        Horse obj=new Horse();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Parent Constructor is called ");
    }
    void eat(){
        System.out.println("Eat");
    }

    abstract void leg();
}
class Horse extends Animal{
    void leg(){
        System.out.println("Runs on four leg");
    }
    Horse(){
        System.out.println("Horse Constructor is called");
    }
}
