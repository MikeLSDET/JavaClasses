package class23;

public class ClassPrivate {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void method1(String name){
        System.out.println("private1");
    }

    private void method1(String name, String name2 , String name3){
        System.out.println("private2");
    }

    private void method1(double d1, String name1, String  name2){
        System.out.println("private3");
    }

    public static void main(String[] args) {
        ClassPrivate classPrivate=new ClassPrivate();
        classPrivate.method1("Hello");
        classPrivate.method1("hi","hello","hey");
        classPrivate.method1(3.5,"hi","Hello");
    }
}
