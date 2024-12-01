public class Car {
    int numOfWheels;
    int numOfGears;
    int numOfSeats;
    String carName;
    String colour;
    String engineType;

    public void Nexon() {
        System.out.println("name os car is "+carName);
        System.out.println("num of wheels is "+numOfWheels);
        System.out.println("num of seats is "+numOfSeats);
        System.out.println("num of gears is "+numOfGears);
        System.out.println("colour of car is "+colour);
        System.out.println("engine type is "+engineType);
    }
    public void Ritz() {
        System.out.println("ritz is "+carName);
        System.out.println("num of wheels is "+numOfWheels);
        System.out.println("num of seats is "+numOfSeats);
        System.out.println("num of gears is "+numOfGears);
        System.out.println("colour of car is "+colour);
        System.out.println("engine type is "+engineType);
    }
    public void getcarname(){
        System.out.println("car name is "+carName);
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.carName="nexon";
        c1.numOfWheels=4;
        c1.numOfSeats=5;
        c1.colour="white";
        c1.engineType="diesel";
        c1.Nexon();
        c1.Ritz(); c1.getcarname();
}
}
