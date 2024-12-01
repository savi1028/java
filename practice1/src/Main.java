class Test {
     int instance_x=4;
    static int y=2;
    public static void main(String[] args) {
        int a=5;
        int b=3;
        Test t=new Test();
        System.out.println(a+b);
        System.out.println(y);
        System.out.println(t.instance_x);
    }
}