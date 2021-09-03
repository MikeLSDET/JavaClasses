package class17;

public class AccessModifiersDemo1Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 accessModifiersDemo1=new AccessModifiersDemo1();
        //System.out.println(accessModifiersDemo1.name);
        // error because cannot access because field is private

        System.out.println(accessModifiersDemo1.age);
        //can access because it is not private and has default
        //access which means we can access it inside same package
        //as well.

       // accessModifiersDemo1.method1();
        //error because method one is private
        accessModifiersDemo1.method4();
        System.out.println(accessModifiersDemo1.city);
    }
}
