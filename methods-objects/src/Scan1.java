import java.util.Scanner;

public class Scan1{

    int x= 5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Scan1 si = new Scan1();
        System.out.println(si.x);

        System.out.println("Please provide an integer value");
        int a= scan.nextInt();
        System.out.println("Please provide an double value");
        double b = scan.nextDouble();
        System.out.println("Please provide comments");
        String c = scan.nextLine();
        Integer i = new Integer(5);
        System.out.println("sum is:"+(a+b));
        System.out.println("comments are:"+c);


    }
}

