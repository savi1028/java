public class Vegitable {
    String name;
    double rate;
    int weight;
    String colour;

    public void tomato(){
        System.out.println("colour of tomato is "+colour);
    }
    public void potato() {
        System.out.println("price of potato is "+rate);
    }

    public static void main(String[] args) {
        Vegitable v=new Vegitable();
        v.name="tomato";
        v.colour="red";
        v.rate=45.50;
        v.weight=1;
        v.tomato();
    }
}
