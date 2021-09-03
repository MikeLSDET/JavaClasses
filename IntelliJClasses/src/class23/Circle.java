package class23;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circle extends Shape {
    Circle(double radius){
        super(radius);
    }

    void area(){
       System.out.println(3.14 *(radius*radius));
    }


    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.area();
    }
}
