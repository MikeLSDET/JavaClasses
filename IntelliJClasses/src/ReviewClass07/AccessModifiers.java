package ReviewClass07;

public class AccessModifiers {
    private String employeeName;
    //it can only be accessed inside the class
     String designation;
     // (default)can be accessed inside and outside of class but not outside package
     protected double salary;
     // (protected)can be accessed just like default, but can access other packages if using keyword "extend"
     public String state;

     AccessModifiers(){

     }

     private void employeeDetails(){
          System.out.println(employeeName);
          System.out.println(designation);
          System.out.println(salary);
     }

     void employeeNameArea(){
          System.out.println(employeeName);
          System.out.println(designation);
          System.out.println(salary);
     }
     public void anotherMethod(){
          System.out.println("Just a public method");
     }

}
