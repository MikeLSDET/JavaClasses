package class17;

import class18.IceCreamHW3;

public class EmpTester {
    public static void main(String[] args) {

        Employee employee=new Employee();

        employee.empID="132";
        employee.salary=100000;
        System.out.println(employee.empID);
        System.out.println(employee.salary);
        System.out.println(Employee.CEO);

        Employee employee1=new Employee();
        employee1.empID="456";
        employee1.salary=120000;
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        IceCreamHW3 iceream3=new IceCreamHW3("mint","baby green");


    }
}
