import java.util.Scanner;
public class Scanscan {
    int x=10;

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanscan s=new Scanscan();
        System.out.println(s.x);

        System.out.println("enter the integer value");
        int a=scan.nextInt();
        System.out.println("enter the double value");
        double d=scan.nextDouble();
        System.out.println("enter comments");
       String c=scan.nextLine();
       Integer i=new Integer(5);
        System.out.println("addition of two numbers is "+(a+d));

    }
}

