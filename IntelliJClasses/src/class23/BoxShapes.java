package class23;

public class BoxShapes {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code
     */

    double length;
    double width;
    double height;

    void calculateArea(double length, double width){
        System.out.println(length*width);
    }
    void calculateArea(double wOrL){
        System.out.println(wOrL*wOrL);
    }

    void calculateArea(double width, double length, double height){
        System.out.println(width*length*height);
    }
}
