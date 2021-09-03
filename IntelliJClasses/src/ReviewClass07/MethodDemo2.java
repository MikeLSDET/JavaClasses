package ReviewClass07;

public class MethodDemo2 {
//possible interview question
    public static void main(String[] args) {
        String test = "Automation job is in high demand in USA";
        String reverseString ="";

        for(int i=test.length()-1;i>=0;i--){
            reverseString +=test.charAt(i);
        }

        System.out.println(reverseString);
    }


}
