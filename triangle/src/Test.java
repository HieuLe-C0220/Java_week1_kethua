public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("green",false);
        System.out.println(shape1);
        Triangle triangle = new Triangle(2.5,3.5,8,"nâu",false);
        System.out.println(triangle);
    }
}
