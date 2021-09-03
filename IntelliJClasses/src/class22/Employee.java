package class22;

public class Employee extends Person {

    //constructors should match

    Employee(String name, int age, double height, double weight){
        //super(name, age, height, weight); must be first line
        //can only use once
        super(name, age, height, weight);
    }
    void getPaid(){
        //super(name, 10 ,10 ,10); not allowed to use construcot in method
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Oxana",16,5.5,35);
        employee.eat();
        employee.sleep();
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.height);
        System.out.println(employee.weight);
    }
}
