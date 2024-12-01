public class Student {
    int total_strength;
    String sname;
    char gender;
    int branch;
    String branchName;

    public void gender(){
        System.out.println("name of student is "+sname);
        System.out.println("gender is " +gender);
    }
    public void  branch() {
        System.out.println("name os Student is "+sname);
        System.out.println("branch is "+branchName);
    }

    public static void main(String[] args) {
       Student s=new Student();
       s.sname="Appu";
       s.gender='M';
       s.branchName="Sandelwood";
       s.gender();
       s.branch();

    }
}
