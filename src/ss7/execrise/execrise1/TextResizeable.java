package ss7.execrise.execrise1;

import ss7.execrise.execrise1.Circle.Circle;
import ss7.execrise.execrise1.Rectangle.Rectangle;
import ss7.execrise.execrise1.Square.Square;

public class TextResizeable {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(4.5,5.5);
        shapes[2] = new Square(4.5);

        for (Shape shape : shapes){
            System.out.println(shape);
        }
        int x = (int)(Math.random()*100);
        for (Shape shape:shapes
             ) {
            shape.resize(x);
            System.out.println(shape);
        }
// ép kiểu
//        for (Shape shape : shapes) {
//            if (shape instanceof Circle){
//                ((Circle) shape).resize(10);
//            }
//            else if (shape instanceof Rectangle){
//                ((Rectangle) shape).resize(10);
//            }else {
//                ((Square) shape).resize(10);
//            }
//            System.out.println(shape);
//        }

    }
}
