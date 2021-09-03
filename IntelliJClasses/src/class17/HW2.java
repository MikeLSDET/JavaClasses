package class17;

public class HW2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverse(String word){
        StringBuilder wordReverse=new StringBuilder(word);

        wordReverse.reverse();

        word=wordReverse.toString();

        return word;


    }
}
