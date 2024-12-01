package Polymorphism;
// Method overriding
public class Demo2 {
    void rules(){
        System.out.println("rule from super class");
    }
}
class SubDemo2 extends Demo2{
    void rules(){
        System.out.println("rule from subclass");
    }
}
class SubDemo22 extends Demo2{
    void rules(){
        System.out.println("rule from sub subclass");
    }

    public static void main(String[] args) {
        SubDemo22 subDemo22=new SubDemo22();
        subDemo22.rules();
    }
}