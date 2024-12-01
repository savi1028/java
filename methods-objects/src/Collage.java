public class Collage {
    String name;
    String place;
    int branches;
    String bname;
    int total;
    char gender;

    public void vtu(){
        System.out.println("name of collage is "+name);
        System.out.println("place is "+place);
        System.out.println("total strength is "+total);
        System.out.println("num of branches is "+branches);
    }
    public void pu(){
        System.out.println("name of collage is "+name);
        System.out.println("place is "+place);
        System.out.println("num of branches is "+branches);
    }

    public static void main(String[] args) {
        Collage c=new Collage();
        c.name="rymec";
        c.place="bellary";
        c.branches=10;
        c.total=1000;
        Collage c1=new Collage();
        c1.name="nalanda";
        c1.place="bellary";
        c1.branches=5;
        c.vtu();
        c1.pu();
        c1.vtu();
    }
}
