public class Whileloop {
    public static void main(String[] args) {
        int i=1;
        while(true) {
            System.out.println("true "+i);
            if (i++ == 10) {
                break;
            }
        }
    }
}
