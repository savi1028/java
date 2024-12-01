public class Ipl {
    String name;
    int salary;
    String team;
    int jersynum;

    public void karnataka() {
        System.out.println("team is "+team);
        System.out.println("player name is "+name);
        System.out.println("ESCN");
    }
    public void tamilnadu() {
        System.out.println("team is " + team);
        System.out.println("player name is " + name);
    }

    public static void main(String[] args) {
        Ipl r=new Ipl();
        r.name="kohli";
        r.salary=22;
        r.team="RCB";

        Ipl c=new Ipl();
        c.name="MSD";
        c.team="CSK";
        c.salary=20;
        r.karnataka();
        c.tamilnadu();
    }
}
