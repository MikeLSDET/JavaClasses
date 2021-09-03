package class23.methodOverloading;

public class CalculatorTester {
    public static void main(String[] args) {
        /*Calculator calculator=new Calculator();
        calculator.addDouble(14.5,14.5);*/

        ImproveCalculator improveCalculator=new ImproveCalculator();
        improveCalculator.add(15.0,14.5);
        improveCalculator.add(15,14);
        int[] arr={10,20,30};
        improveCalculator.add(arr);
        improveCalculator.add(15,14,15);
        improveCalculator.add(15,14,15,15);
        improveCalculator.add(15,14,15,15,15);
        improveCalculator.add(15,14);
    }
}
