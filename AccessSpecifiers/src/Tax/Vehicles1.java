package Tax;

public class Vehicles1 {
    void Type(){
        System.out.println("1.Road Transport Vehicles");
    }
}
class Bus extends Vehicles1{
    void bus(){
        System.out.println("2.bus is KSRTC");
    }
}
class Cars extends Vehicles1{
    void car(){
        System.out.println("3.car is Toyota");
    }
}
class Bike extends Vehicles1{
    void bike(){
        System.out.println("4.bike has 2 wheels");
    }
}
class Cycle extends Vehicles1{
   void cycle(){
       System.out.println("5.cycle is basic Vehicle for learners");
   }
}
class Train extends Vehicles1{
    void train(){
        System.out.println("6.train travels very speed");
    }
}
class Boat extends Vehicles1 {
    void boat() {
        System.out.println("7.boat is water transport");
    }

    public static void main(String[] args) {
        Bus b = new Bus();
        b.bus();
        Cars c = new Cars();
        c.car();
        Bike bi = new Bike();
        bi.bike();
        Cycle cy = new Cycle();
        cy.cycle();
        Train t = new Train();
        t.train();
        Boat bo = new Boat();
        bo.boat();
        //bo.train();
    }
}