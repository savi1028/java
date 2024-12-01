package Tax;

public class Animal {
    void eat() {
        System.out.println("they eat for living");
    }
}
class Tiger extends Animal {
    void tigerFood() {
        System.out.println("Tiger eat deer");
    }
}
    class Deer extends Tiger {
        void deerFood() {
            System.out.println("deer eats grass");
        }


        public static void main(String[] args) {
            Tiger tiger=new Tiger();
            Deer deer = new Deer();
            tiger.eat();
            tiger.tigerFood();
            deer.eat();
            deer.tigerFood();
            deer.deerFood();
        }
    }