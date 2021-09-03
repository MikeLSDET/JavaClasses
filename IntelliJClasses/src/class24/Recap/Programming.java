package class24.Recap;

public class Programming {
    /*
    Ccreate a class named 'Programming'
    While creating an object of the clas,
    if nothing is passsed to it, then message " I love programming languages"
    should be printed. if some String is passed to it, then in plave of "programming langauges" the value variable should be printed.
    Example, if we pass "java", then " I love java" should be printed.

     */

    Programming(){
        System.out.println(" I love programming languages");
    }

    Programming(String name){
        System.out.println("I love "+name);
    }

    public static void main(String[] args) {
        Programming programming=new Programming();

        Programming programming1=new Programming("Java");
        //new Programming(int 1); error becuase no matching constructor
    }
}
