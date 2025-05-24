public class Liskov {
    public static void main(String args[]){
        Base b=new Base();
        b.m1();
        b.m2();
        Child c=new Child();
        c.m1();
        c.m2();
        c.m3();
        Base a=new Child();//Is particular line ka matlab hota hai Child parents ki jagah use toh ho skta hai lekin object hamesha parent ka hi banega
        a.m1();


    }
}
class Base{
    public void m1(){
        System.out.println("main m1 ");
    }
    public void m2(){
        System.out.println("main m2");
    }
}

class Child extends Base{
    public void m3(){
        System.out.println("child m3");
    }
}
