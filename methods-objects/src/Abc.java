public class Abc {
    String name;
    int rating;
    String comments;
    String subject;

    public void java() {
        System.out.println(name);
        System.out.println(subject);
        System.out.println("rating is " + rating);
        System.out.println(comments);
    }

    public void testing() {
        System.out.println(name);
        System.out.println(subject);
        System.out.println("rating is " + rating);
        System.out.println(comments);
    }

    public void linux() {
        System.out.println(name);
        System.out.println(subject);
        System.out.println("rating is " + rating);
        System.out.println(comments);
    }

    public static void main(String[] args) {
        Abc a = new Abc();
        a.name = "praveen";
        a.rating = 10;
        a.comments = "god of Abc students";
        a.subject = "java";
        a.java();
        Abc a1=new Abc();
        a1.testing();
        a1.name = "Anand";
        a1.rating = 10;
        a1.subject = "manual";
        a1.testing();
    }
}