package class17;

public class HW3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private void vowelWord(String word) {
          System.out.println(word = word.replaceAll("[B-Db-dF-Hf-hJ-Nj-nP-Tp-tW-Zw-z0-9]", ""));

    }


    public static void main(String[] args) {

        HW3 hw3=new HW3();

        hw3.vowelWord("ABCDEFGHIJKLMNOPQRTSTUVWXYZBoooulien123495852394832");

    }
}
