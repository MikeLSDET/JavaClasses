package class18;

public class StudentHW5 {
    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    StudentHW5(String nameOfStudent, String addressOfStudent){
        name=nameOfStudent;
        address=addressOfStudent;
    }

    void displayInfo(){
        System.out.println(  "student name is "+name+" and their address is " +address);
    }
}
