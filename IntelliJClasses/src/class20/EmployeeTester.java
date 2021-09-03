package class20;

import class21.Person;

public class EmployeeTester {
    public static void main(String[] args) {
        EmployeeFromOtherP employee=new EmployeeFromOtherP();
       // employee.name; can't access because its private and we are not inside the same class
        //employee.age; can't access because its default access modifier
        //employee.height; can't access because no extends keyword
        employee.weight=50;
        employee.sleep();
        //employee.eat(); can't access, no extends keyword
        Person.run();
        EmployeeFromOtherP.run();

    }
}
