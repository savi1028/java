package Polymorphism;

public class Methodover3 {
    void shop(){
        System.out.println("its a trends clothing Centre");
    }
}
class Cloths extends Methodover3{
    void shop(){
        System.out.println("its a Biba cloth shop");
    }
}
class Cloths1 extends Cloths{
    void shop(){
        System.out.println("Its a Pantaloons Shop");
    }
}
class Cloths2 extends Cloths1{
    void shop(){
        System.out.println("Its a Soch cloth store");
    }

    public static void main(String[] args) {
        Cloths2 cloths2=new Cloths2();
        cloths2.shop();
    }
}
