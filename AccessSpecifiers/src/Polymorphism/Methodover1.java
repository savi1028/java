package Polymorphism;

class Methodover1 {
    void address() {
        System.out.println("karnataka");
    }
}
class Over2 extends Methodover1{
    void address(){
        System.out.println("Andra Pradesh");
    }
}
class Over3 extends Over2{
    void address(){
        System.out.println("Kerala");
    }
}
class Over4 extends Over3{
    @Override
    void address() {
        System.out.println("TamilNadu");
    }

    public static void main(String[] args) {
       Over4 over4=new Over4();
       over4.address();
    }
}