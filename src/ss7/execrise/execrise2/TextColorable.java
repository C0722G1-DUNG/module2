package ss7.execrise.execrise2;

import ss7.execrise.execrise1.Shape;

public class TextColorable {
    public static void main(String[] args) {
        Colorable[] colorable = new Colorable[3];
        colorable[0] = new Circle(10.0);
        colorable[1] = new Ractangle(10.0,10.0);
        colorable[2] =new Square(10);
        for (Colorable colorable1 : colorable ) {
            System.out.println("diện tích là "+ colorable1 );
            if (colorable1 instanceof Square){
                System.out.println();
            }
        }
}
}