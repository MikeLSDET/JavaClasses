package class23.superdemo1;

public class Person {
    String name;
    int age;
    double height;
    double weight;
    String address;
    String phoneNumber;

    void printInfo(){
        System.out.println(name+age+height+weight+address+phoneNumber);
    }

    public Person(String name, int age, double height, double weight, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


}
