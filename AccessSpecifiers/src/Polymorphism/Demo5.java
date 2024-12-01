package Polymorphism;
//method overloading
public class Demo5 {
    void Vehicle(String a, int seats, double price) {
        System.out.println(a + "num of seats is"+seats + " price is::" + price);
    }

    void Vehicle(String a, int seats, int price) {
        System.out.println(a + "num of seats is s" + seats + " price is::" + price);
    }

    void Vehicle(String b, int seats,int gear, double price) {
        System.out.println(b + "::num of seats is::" + seats + "price is::" + price);
    }

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        demo5.Vehicle("car", 5, 18);
    }
}