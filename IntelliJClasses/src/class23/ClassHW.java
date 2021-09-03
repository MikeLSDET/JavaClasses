package class23;

public class ClassHW {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void method1(String name){
        System.out.println("overload1");

    }

    static void method1(int num1, int num2){
        System.out.println("overload2");
    }

    static void method1(double num1, double num2){
        System.out.println("overload3");
    }
}
