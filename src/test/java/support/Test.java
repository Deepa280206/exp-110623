package support;

import org.w3c.dom.css.Rect;

public class Test {
    public static void main(String[] args) {
//        Rectangle rect1 = new Rectangle();
//        rect1.width = 100;
//        rect1.height = 50;
//        System.out.println("Rect1 perimeter: " + rect1.getPerimeter());
//        System.out.println("Rect1 area: " + rect1.getArea());
//
//        Rectangle rect2 = new Rectangle();
//        rect2.width = 10;
//        rect2.height = 30;
//        System.out.println("Rect2 perimeter: " + rect2.getPerimeter());
//        System.out.println("Rect2 area: " + rect2.getArea());

        Rectangle rect3 = new Rectangle(50,100);
        System.out.println("Rect3 perimeter: " + rect3.getPerimeter());
        System.out.println("Rect3 area: " + rect3.getArea());

    }
}

class Rectangle
{
    public double width;
    public double height;

    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }
    public double getPerimeter()
    {
        return 2*(width+height);
    }

}
