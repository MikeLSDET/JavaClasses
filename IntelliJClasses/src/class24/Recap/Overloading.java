package class24.Recap;

public class Overloading {
    void sayHello(){
        System.out.println("Hello");
    }

    private void sayHello(String name){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method with");
    }

    public static void main(String args) {
        System.out.println("Inside the main method with String args");
    }

    public static void main(int args) {
        System.out.println("Inside the main method with int args");
    }


}
