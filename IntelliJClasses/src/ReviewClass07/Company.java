package ReviewClass07;

public class Company {

    String name;
    int year;
    String country;
    String state;
    int numberOfEmployees;

    Company(){
        name ="MS";
        year= 1996;
        country="USA";
        state= "VA";
        numberOfEmployees = 1000;
    }

    Company(String companyName){
        name= companyName;
        year= 1996;
        country="USA";
        state="VA";
        numberOfEmployees=1000;

    }


    Company(String companyName, String countryName){
        name= companyName;
        year= 1996;
        country=countryName;
        state="VA";
        numberOfEmployees=1000;

    }
    void printCompanyInfo(){
        System.out.println(name + " "+year+" " + country+" " + state+" " + numberOfEmployees);
    }
}
