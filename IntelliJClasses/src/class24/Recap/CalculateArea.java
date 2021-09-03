package class24.Recap;

public class CalculateArea {

    void area(double width, double length){
        System.out.println("Area "+width*length);
    }
    void area(double side){
        System.out.println("Area "+side*side);
    }

    void area(double height, double length, double width){
        System.out.println(length*width*height);
    }


    public static void main(String[] args) {
        CalculateArea calculateArea=new CalculateArea();
        calculateArea.area(10);
    }


}
