public class Employee {
    int empno;
    String ename;
    int salary;
    int deptno;
    String dname;
    public void getEname() {
        System.out.println("employee name is " +ename);
    }
    public void getSalary() {
        System.out.println("salary of employee is " +salary);
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.ename="Advaith";
        emp.salary=50000;
        emp.empno=8;
        emp.deptno=3;
        emp.dname="daycare";
        emp.getEname();
        emp.getSalary();


    }
}