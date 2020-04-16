public class Test {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(3.2f,1.5f);
        System.out.println(p2);
        MoveablePoint p3 = new MoveablePoint(2.5f,2.5f,3f,6f);
        System.out.println(p3);
        p3.move();
        System.out.println(p3);
    }
}
