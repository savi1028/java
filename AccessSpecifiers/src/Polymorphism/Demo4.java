package Polymorphism;
// method overloading
public class Demo4 {
    void diff(int a, int b){
        int c=a-b;
        System.out.println("diff of 2 numbers is "+c);
    }
    void diff(int a, int b,int c){
        int d=a-b-c;
        System.out.println("diff of 3 numbers is "+d);
    }
    void diff(double a, int b, double c){
        double d=a-b-c;
        System.out.println("diff of 3 decimal numbers is::"+d);
    }

    public static void main(String[] args) {
        Demo4 demo4=new Demo4();
        demo4.diff(100,50);
        demo4.diff(100,40,20);
        demo4.diff(30.5,30,2.0);
    }
}
