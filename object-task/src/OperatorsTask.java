import jdk.nashorn.internal.ir.Assignment;

public class OperatorsTask {
    public static void main(String[] args) {
       /* ARITHMATIC OPERATORS
        int a=100;
        int b=20;
        System.out.println("a value is " +a);
        System.out.println("b value is " +b);
        System.out.println("sum is " +(a+b));
        System.out.println("diff is "+(a-b));
        System.out.println("result is " +(a*b));
        System.out.println("result is " +(a/b));
        System.out.println("result is " +(b/a));
        System.out.println(b/a); */

        /* relational operators

        int x=5;
        int y=7;
        int z=10;
        System.out.println("equals " + (x==y));
        System.out.println("not equals "+(x!=y));
        System.out.println("not equals "+(x>y));
        System.out.println("not equals "+(x<y));
        System.out.println("not equals "+(x>=y));
        System.out.println("not equals "+(x<=y));
        System.out.println("not equals "+(x>y));
        System.out.println("not equals "+(z>y));
        System.out.println("not equals "+(z>x));
        System.out.println("not equals "+(y>x)); */

        /* INCREMENT / DECREMENT

        int a=1;
        int b=10;
        System.out.println("initial value of a is " +a);
        System.out.println("increment of a " +(++a));
        System.out.println("now the value of a is " +a);
        System.out.println("increment of a " +(++a));
        System.out.println("now the value of a is " +a);
        System.out.println("increment of a " +(++a));
        System.out.println("now the value of a is " +a);
        System.out.println("increment of a " +(++a));
        System.out.println("now the value of a is " +a);
        System.out.println("decrement of a " +(--a));
        System.out.println("now the value of a is " +a);
        System.out.println("decrement of a " +(--a));
        System.out.println("now the value of a is " +a); */

        /* LOGICAL OPERATORS
        int a=10; int b=20; int c=10;
        System.out.println("and " +((a==b) && (a==c) && (b==c)));
        System.out.println("and " +((a==b) && (a==c) && (b==c)));
        System.out.println("and " +((a==c)  && (c==a)));
        System.out.println("or " +((a==b) || (c==a) ||(a==c)));
        System.out.println("or " +((a==b) || (c==a) && (a==c)));
        System.out.println("not : " +(!(a==b)));
        System.out.println("not : " +(!(a==c)));   */

        /* Assignment operators

         */
        int a=2; int b=50;

        System.out.println(a);
        System.out.println(b);
        System.out.println("assignment a+=5 is "+ (a+=5));
        System.out.println(a);
        System.out.println("vlaue of b is " +b);
        System.out.println("assignment b-=10 " +(b-=10));
        System.out.println(b);


    }
}

