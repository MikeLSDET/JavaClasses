package class19;

import class18.Car;

public class CatTester {
    public static void main(String[] args) {
        String str_Sample = "RockStaraaaaaaa";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
        System.out.println(str_Sample.contains("R"));
        System.out.println(str_Sample.replace("a","1"));

        String e="  ";
        System.out.println(e.isEmpty());
    }
}
