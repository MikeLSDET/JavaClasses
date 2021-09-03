package class16;

import class17.AccessModifiersDemo1;

public class AccessModifierDemo1Tester extends AccessModifiersDemo1 {

    void methodInSeparateClass(){
        //System.out.println(name);
        //System.out.println(age);
        System.out.println(city);
        System.out.println(height);
    }
    public static void main(String[] args) {

        AccessModifiersDemo1 accessModifiersDemo1=new AccessModifiersDemo1();
        //System.out.println(accessModiferDemo1.name);
        //cannot access because default works in same
        //package only (in this case original package was class17)

       // accessModifiersDemo1.method2();
        accessModifiersDemo1.method3();
        //accessModifiersDemo1.method4(); wont work since method 4 is protected

        System.out.println(accessModifiersDemo1.height);
    }
}
