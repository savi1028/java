public class Vehicle {
    int numOfWheels;
    String name;
    int capacity;
    boolean sunroof;

    public void bus() {
        System.out.println("name of vehicle " +name);
        System.out.println("numOfWheels " +numOfWheels);
        System.out.println("capacity is " +capacity);
    }
    public void bike() {
        System.out.println("name of vehicle " +name);
        System.out.println("numOfWheels " +numOfWheels);
        System.out.println("capacity is " +capacity);
    }
    public void car() {
        System.out.println("name of vehicle " +name);
        System.out.println("numOfWheels " +numOfWheels);
        System.out.println("capacity is " +capacity);
    }

    public static void main(String[] args) {
        Vehicle v =new Vehicle();
        v.name="vrl";
        v.capacity=50;
        v.numOfWheels=4;
        v.bus();

        Vehicle v1=new Vehicle();
        v1.name="nexon";
        v1.capacity=5;
        v1.numOfWheels=4;
        v1.car();

        Vehicle v2=new Vehicle();
        v2.name="TVS Iqube";
        v2.capacity=2;
        v2.numOfWheels=2;
        v2.bike();
    }



}
