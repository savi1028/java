public class Numbers {
    int a;
    int b;
    double c;
    public void add(){
        double sum= a+b+c;
        System.out.println("sum of numbers is "+sum);
    }
    public void sub(){
        double diff= a-b-c;
        System.out.println("difference of numbers is "+diff);
    }
    public void multiply() {
        double result= a*b*c;
        System.out.println("multiplication of all numbers is "+result);
    }
    public void division(){
        double result= a/b;
        System.out.println("division of 2 numbers is "+result);
    }

    public static void main(String[] args) {
        Numbers n=new Numbers();
        n.a=100;
        n.b=10;
        n.c=10.2;
        n.add();
        n.sub();
        n.multiply();
        n.division();

    }
}
