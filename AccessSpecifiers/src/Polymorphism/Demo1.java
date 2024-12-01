package Polymorphism;
//Method overloading
public class Demo1 {
    void add(int a,int b){
        int c=a+b;
        System.out.println("sum of 2 numbers is "+c);
    }
    void add(int a,int b, int c){
        int d=a+b+c;
        System.out.println("sum of 3 numbers is "+d);
    }
    void add(double a,double b,double c){
        double d=a+b+c;
        System.out.println("sum of decimal numbers is "+d);
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.add(10,20,30);
        demo1.add(10.23,3.45,20);
        demo1.add(2,5);
    }
}
