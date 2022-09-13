package ss6_inheritunce.exercise.exercise3;

public class TextMovablePoint {
    public static void main(String[] args) {

    MovablePoint movablePoint = new MovablePoint(2,4,5,6);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move().move().move());
    }
}
