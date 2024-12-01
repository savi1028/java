package Polymorphism;
//Method Overloading
public class  Demo3{
   void area(int a,int b) {
       int c=a*b;
       System.out.println("area of Square is "+c);
   }
   void area(double pi,int r) {
       double c=pi*r*r;
       System.out.println("area of circle is "+c);
   }
   void area(double half,int b,int h) {
       double result=half*b*h;
       System.out.println("area of Triangle is "+result);
   }

    public static void main(String[] args) {
        Demo3 demo3=new Demo3();
        demo3.area(4,10);
        demo3.area(3.142,10);
        demo3.area(.5,10,50);
    }
}
