package class18;

public class HW1 {
    //Write a program that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    //employee info
    String name;
    int age;
    String employeeID;
    int ssn;
    double salary;

    HW1(String nameOfEmployee, int ageOfEmployee, String idOfEmployee, int ssnOfEmployee, double salaryOfEmployee){

       name=nameOfEmployee;
       age=ageOfEmployee;
       employeeID=idOfEmployee;
       ssn=ssnOfEmployee;
       salary=salaryOfEmployee;




    }


    HW1(){
       name="n/a";
       age=0;
       employeeID="n/a";
       ssn=0;
       salary=0;

    }

    void printEmployeeInfo(){
        System.out.println("Employee name is "+name+", age is "+age+" ID code is "+employeeID+" , their ssn is "+ssn+
                " and their salary is "+salary);
    }



}
