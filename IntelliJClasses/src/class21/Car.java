package class21;

public class Car {
    String model;
    String make;
    int year;
    Car(){
        System.out.println("Empty constructor with zero parameters");
    }

    Car(String model){
        this();
        this.model=model;
        this.make="None";
        this.year=0;
        System.out.println("Constructor with 1 parameters");
    }
    Car(String model, String make){
        this(model);
        this.make=make;
        this.year=0;
        System.out.println("Constructor with 2 parameters");
    }
    Car(String make, String model, int year){
        //model=model;
        //make=make;
        this(model,make);
        year=year;
        System.out.println("Constructor with 3 parameters");

    }

    void printInfo(){
        String make="Honda";
        String model="Civic";
        int year=2022;
        System.out.println(this.model+this.make+this.year);
    }
}
