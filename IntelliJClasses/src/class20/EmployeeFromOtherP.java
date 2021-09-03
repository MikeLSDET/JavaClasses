package class20;

import class21.Person;

public class EmployeeFromOtherP extends Person {
    String empId;
    double salary;

    void work(){
        System.out.println("Employee "+empId+" having height"+height+" is working");
    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
    public static void takeLeave(){
        System.out.println("Employee");
    }

}
