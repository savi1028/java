package Pack1;
public class Demo1 {
    //Public Access odifier
    public void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    /*package Pack2;

import Pack1.Demo1;

public class Practice1 {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.add(10,30);
    }
}*/

    //Private Access Modifier
    private void newAdd(int x, int y){
        int z=x+y;
        System.out.println(z);
    }
    /*public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.newAdd(20,6);  */


    //Protected Access Modifier
    protected void newAddition(){
        int a=10,b=20,c=30;
        int d=a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.newAdd(20,6);
    }

}

