package Pack1;

public class Demo2 {
    //Public Access Modifier
    public void area(int r){
        double pi=3.214;
        double result=pi*r*r;
        System.out.println("area of circle is "+result);
    }
    //Private Access Modifier
    private void SquareArea( int r){
      int result=r*r;
        System.out.println("area of Square is "+result);
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        demo2.SquareArea(5);
        Demo1 demo1=new Demo1();
        //Protected Access Specifier
        demo1.newAddition();

    }
}

/* package Pack2;

import Pack1.Demo2;

public class Practice2 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.area(20);
    }
}
  */
