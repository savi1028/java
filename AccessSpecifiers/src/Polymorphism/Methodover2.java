package Polymorphism;
class Methodover2 {
    void School(){
        System.out.println("Its a govt School");
    }
}
class Study1 extends Methodover2 {
    void School(){
        System.out.println("its private schhol");
    }
}
class Study2 extends Study1{
    void School(){
        System.out.println("its a semi govt school");
    }

    public static void main(String[] args) {
        Study2 study2=new Study2();
        study2.School();
        Study1 study1=new Study1();
        study1.School();
    }
}