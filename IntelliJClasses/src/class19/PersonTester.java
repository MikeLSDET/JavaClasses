package class19;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person1=new Person("Jamil");
        person1.printInfo();

        Scanner scanner=new Scanner(System.in);
        Person person2=new Person(scanner.next());
        person2.printInfo();


    }
}
