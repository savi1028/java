public class Nestedif {
    public static void main(String[] args) {
        int a=10, b=20, c=10;
        if(a>b) {
            System.out.println("a is greater than b");
        }else if(a==b) {
            System.out.println("a and b are equal");

        }else if(a==c) {
            System.out.println("a and c are equal");
        }else if(b>a) {
            System.out.println("b is greater than a");
        }
        else {
            System.out.println("all are fail");
        }
    }
}
