public class Fibonacci {
    public static void main(String[] args) {
        for(int a=0;a<=100;a++) {
            for(int b=1;b<=100;b++){
                int c=a+b;
                System.out.println(c);
                break;
                a=b;
                b=c;

            }

        }
    }
}
