public class Area {
    int radius;
    double pi;
    
    int diameter;
    int height;

    public void circle() {
        double areaOfCircle=2*pi*radius;
        System.out.println("area of circle is "+areaOfCircle);
    }
    public void square() {
        int areaOfSquare=radius*radius;
        System.out.println("area of square is " +areaOfSquare);
    }
    public void triangle(){
        double areaOfTriangle= 0.5*height*radius;
        System.out.println("area of triangle is " +areaOfTriangle);
    }
    public static void main(String[] args) {
        Area a=new Area();
        a.radius=4;
        a.height=10;
        a.pi=3.142;
        a.circle();
        a.square();
        a.triangle();

        Area a1=new Area();
        a1.radius=10;
        a1.height=100;
        a1.pi=3.142;
        a1.circle();
        a1.square();
        a1.triangle();


    }

}
