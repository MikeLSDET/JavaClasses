package class18;

import class17.Student;

public class StudentsHW2Tester {

    public static void main(String[] args) {
        StudentsHW2 student1=new StudentsHW2("Larry",100,99,100);
        System.out.println(student1.average());

        StudentsHW2 student2=new StudentsHW2("John", 89,80,85);
        System.out.println(student2.average());

        StudentsHW2 student3=new StudentsHW2("Kevin",70,75,79);
        System.out.println(student3.average());

        StudentsHW2 student4=new StudentsHW2("Frank",66,65,69);
        System.out.println(student4.average());

        StudentsHW2 student5=new StudentsHW2("Doofy",55,65,45);
        System.out.println(student5.average());

        IceCreamHW3 icecream2=new IceCreamHW3("Chocolate","brown","smooth");

    }
}
