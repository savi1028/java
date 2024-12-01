package Pack1;

public class Protected1 {
    protected  void proarea(){
        int r=20;
        int result=r*r;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Protected1 protected1=new Protected1();
        protected1.proarea();
    }
}
/*      package Pack1;
         class Demo3 {
       public static void main(String[] args) {

        Protected1 protected1=new Protected1();
        protected1.proarea();
    }
}      */
