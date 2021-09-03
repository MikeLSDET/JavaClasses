package class19;

public class Person {

    String name;
    int age;
    double weight;
    double height;
    String education;

    // to comment out/in ctrl+shift+forward slash/

    Person(){
        System.out.println("Important lines of cdoe that should always be" +
                "executed when  creating the object of this class");
    }
    Person(String personName){
        this();//calls the no argument constructor,must be first line of code when using "this" keyword
        System.out.println("first constructor");

        name=personName;



    }

    void printInfo(){
        System.out.println("Name "+name+ " age "+age+" weight "+weight+" height"+height+" education "+education);
    }

    Person(int personAge, String personName){
        this();
        System.out.println("2nd constructor");

        name=personName;
        age=personAge;

    }


}
