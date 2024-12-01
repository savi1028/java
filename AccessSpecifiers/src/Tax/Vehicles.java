package Tax;

public class Vehicles {
    void use(){
        System.out.println("1.vehicles are used for transportation");
    }
}
class Car extends Vehicles{
    void brand() {
        System.out.println("2.brands are tata,hundayi,skoda,bmw,ritz");
    }
}
class CarName extends Car{
    void name(){
        System.out.println("3.car brand is Tata Nexon");
    }
}
class CarSeat extends CarName {
    void seat(){
        System.out.println("4.in car 5 seats are available");
    }
}
class CarSeatBelt extends CarSeat{
    void SearBelt(){
        System.out.println("5.for each seat seatbelt is available");
    }
}
class CarPrice extends CarSeatBelt{
    void price(){
        System.out.println("6.anyone can buy");
    }

    public static void main(String[] args) {
        Car car = new Car();
        CarName carname = new CarName();
        CarSeat carSeat = new CarSeat();
        CarSeatBelt carSeatBelt = new CarSeatBelt();
        CarPrice carPrice = new CarPrice();

       /* car.use();
        car.brand();

        carname.use();
        carname.brand();
        carname.name();

        carSeat.use();
        carSeat.brand();
        carSeat.name();
        carSeat.seat();

        carSeatBelt.use();
        carSeatBelt.brand();
        carSeatBelt.name();
        carSeatBelt.seat();
        carSeatBelt.SearBelt(); */

        carPrice.use();
        carPrice.brand();
        carPrice.name();
        carPrice.seat();
        carPrice.SearBelt();
        carPrice.price();
    }
    }