package class18;

public class Task3 {

    private  static String onlyVowels(String inputStr){
        return inputStr.replaceAll("[^AIEOUaioue]","");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("abcdefghiaeioU"));
    }
}
