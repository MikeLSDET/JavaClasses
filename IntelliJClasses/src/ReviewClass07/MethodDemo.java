package ReviewClass07;

public class MethodDemo {



    public static void main(String[] args) {

        String employeeFirstName= "mike";
        String employeeLastName ="adam";
        String level = "guest";

        if(level.equalsIgnoreCase("permanent")){
            String firstHalfOfFirstName = employeeFirstName.substring(0,employeeFirstName.length()/2);
            String firstHalfOfLastname = employeeLastName.substring(employeeLastName.length()/2);
            System.out.println(firstHalfOfFirstName+firstHalfOfLastname);

        }else {
            String firstHalfOfFirstName = employeeLastName.substring(0, employeeLastName.length()/2);
            String firstHalfOfLastName = employeeFirstName.substring(employeeFirstName.length()/2);
            System.out.println(firstHalfOfFirstName+firstHalfOfLastName);
        }
    }


}
